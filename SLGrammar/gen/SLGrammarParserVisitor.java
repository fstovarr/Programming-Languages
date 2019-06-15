// Generated from /home/fabiotovar/Proyectos/Programming Languages/AntlrTutorial/grammar/SLGrammarParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLGrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SLGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SLGrammarParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#const_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declarations(SLGrammarParser.Const_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#types_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes_declarations(SLGrammarParser.Types_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#var_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declarations(SLGrammarParser.Var_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#simple_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_variables(SLGrammarParser.Simple_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#simple_variable_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_variable_aux(SLGrammarParser.Simple_variable_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SLGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#subroutines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutines(SLGrammarParser.SubroutinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(SLGrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#param_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_declaration(SLGrammarParser.Param_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLGrammarParser#param_declaration_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_declaration_aux(SLGrammarParser.Param_declaration_auxContext ctx);
}