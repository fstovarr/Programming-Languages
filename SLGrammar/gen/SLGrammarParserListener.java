// Generated from /home/fabiotovar/Proyectos/Programming Languages/AntlrTutorial/grammar/SLGrammarParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLGrammarParser}.
 */
public interface SLGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SLGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SLGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SLGrammarParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SLGrammarParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#const_declarations}.
	 * @param ctx the parse tree
	 */
	void enterConst_declarations(SLGrammarParser.Const_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#const_declarations}.
	 * @param ctx the parse tree
	 */
	void exitConst_declarations(SLGrammarParser.Const_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#types_declarations}.
	 * @param ctx the parse tree
	 */
	void enterTypes_declarations(SLGrammarParser.Types_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#types_declarations}.
	 * @param ctx the parse tree
	 */
	void exitTypes_declarations(SLGrammarParser.Types_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#var_declarations}.
	 * @param ctx the parse tree
	 */
	void enterVar_declarations(SLGrammarParser.Var_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#var_declarations}.
	 * @param ctx the parse tree
	 */
	void exitVar_declarations(SLGrammarParser.Var_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#simple_variables}.
	 * @param ctx the parse tree
	 */
	void enterSimple_variables(SLGrammarParser.Simple_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#simple_variables}.
	 * @param ctx the parse tree
	 */
	void exitSimple_variables(SLGrammarParser.Simple_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#simple_variable_aux}.
	 * @param ctx the parse tree
	 */
	void enterSimple_variable_aux(SLGrammarParser.Simple_variable_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#simple_variable_aux}.
	 * @param ctx the parse tree
	 */
	void exitSimple_variable_aux(SLGrammarParser.Simple_variable_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SLGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SLGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#subroutines}.
	 * @param ctx the parse tree
	 */
	void enterSubroutines(SLGrammarParser.SubroutinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#subroutines}.
	 * @param ctx the parse tree
	 */
	void exitSubroutines(SLGrammarParser.SubroutinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SLGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SLGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#param_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParam_declaration(SLGrammarParser.Param_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#param_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParam_declaration(SLGrammarParser.Param_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLGrammarParser#param_declaration_aux}.
	 * @param ctx the parse tree
	 */
	void enterParam_declaration_aux(SLGrammarParser.Param_declaration_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLGrammarParser#param_declaration_aux}.
	 * @param ctx the parse tree
	 */
	void exitParam_declaration_aux(SLGrammarParser.Param_declaration_auxContext ctx);
}