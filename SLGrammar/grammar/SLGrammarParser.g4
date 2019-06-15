parser grammar SLGrammarParser;

file :
        (PROGRAMA ID)? declarations* body subroutines
        ;

declarations : const_declarations
        | types_declarations
        | var_declarations
        ;

const_declarations :
        CONST (ID TK_ASSIGN (TK_STRING
                                | INT_NUMBER
                                | REAL_NUMBER
                                | EXP_NUMBER
                                | PREDEF_CONST_POS
                                | PREDEF_CONST_NEG))+
        ;

types_declarations : DATA_TYPE
        ;

var_declarations : VAR simple_variables+
        ;

simple_variables :
        simple_variable_aux DATA_TYPE
        | simple_variable_aux VECTOR TK_LEFT_BRACE INT_NUMBER TK_RIGHT_BRACE DATA_TYPE
        | simple_variable_aux MATRIX TK_LEFT_BRACE INT_NUMBER (TK_COMMA INT_NUMBER)+ TK_RIGHT_BRACE DATA_TYPE
        | simple_variable_aux RECORD TK_LEFT_BRACKET (simple_variables)+ TK_RIGHT_BRACKET
        ;

simple_variable_aux :
        ID (TK_COMMA ID)* TK_DOUBLE_POINT
        ;

access_variable : ID access_variable_aux
        ;

access_variable_aux : TK_POINT ID access_variable_aux
        | TK_LEFT_BRACE INT_NUMBER (TK_COMMA INT_NUMBER)* TK_RIGHT_BRACE access_variable_aux
        |
        ;

expressions :
        |
        ;

operand : ID
        | INT_NUMBER
        | REAL_NUMBER
        | EXP_NUMBER ;

additive_operation : TK_PLUS
        | TK_MINUS ;

multiplicative_operation : TK_TIMES
        | TK_DIVISION
        | TK_MOD;

additive_expression :
        multiplicative_expression (additive_operation multiplicative_expression)*
        ;

multiplicative_expression :
        potentiation_expression (multiplicative_operation potentiation_expression)*
        ;

potentiation_expression :
        change_sign_expression TK_POWER potentiation_expression
        | change_sign_expression
        ;

change_sign_expression : additive_operation* unit;

unit : operand
        | TK_LEFT_PAR additive_expression TK_RIGHT_PAR;

body : START END
        ;

subroutines : SUBROUTINE ID parameters (RETURNS DATA_TYPE)? declarations body
        |
        ;
// Revisar
parameters : TK_LEFT_PAR param_declaration? TK_RIGHT_PAR
        ;

param_declaration : REF? ID param_declaration_aux
        |
        ;

param_declaration_aux : ID
        |
        ;