// Generated from calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(calculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(calculatorParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(calculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(calculatorParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACosine(calculatorParser.ACosineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(calculatorParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(calculatorParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Signed}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned(calculatorParser.SignedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtoms(calculatorParser.AtomsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSine(calculatorParser.SineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTangent(calculatorParser.TangentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASine(calculatorParser.ASineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogarithm(calculatorParser.LogarithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATangent(calculatorParser.ATangentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(calculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosine(calculatorParser.CosineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(calculatorParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(calculatorParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantPI(calculatorParser.ConstantPIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantE(calculatorParser.ConstantEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(calculatorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(calculatorParser.BracesContext ctx);
}