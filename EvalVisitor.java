/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends calculatorBaseVisitor<Double> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Double> memory = new HashMap<String, Double>();
    
    @Override
    public Double visitAssign(calculatorParser.AssignContext ctx) {
        String id = ctx.VARIABLE().getText();  // id is left-hand side of '='
        double value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Double visitPrintExpr(calculatorParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0.0;                          // return dummy value
    }

  
    /** Power */
    @Override
    public Double visitPower(calculatorParser.PowerContext ctx) {
        double left = visit(ctx.expr(0));  // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        return Math.pow(left,right); 
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Double visitMulDiv(calculatorParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));  // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == calculatorParser.TIMES ) return left * right;
        return left / right; 
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Double visitAddSub(calculatorParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));  // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == calculatorParser.PLUS ) return left + right;
        return left - right; 
    }

    /** Signed */
    @Override
    public Double visitSigned(calculatorParser.SignedContext ctx) {
        double value = visit(ctx.atom());  // get value of subexpression
        if ( ctx.op.getType() == calculatorParser.PLUS ) return value;
        return (-1) * value; 
    }

    /** Double */
    @Override
    public Double visitDouble(calculatorParser.DoubleContext ctx) {
        return Double.valueOf(ctx.DOUBLE().getText());
    }

    /** Integer **/
    @Override
    public Double visitInteger(calculatorParser.IntegerContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }

    /** ConstantPI **/
    @Override
    public Double visitConstantPI(calculatorParser.ConstantPIContext ctx) {
        return Double.valueOf(Math.PI);
    }

    /** ConstantE **/
    @Override
    public Double visitConstantE(calculatorParser.ConstantEContext ctx) {
        return Double.valueOf(Math.E);
    }

    /** Variable */
    @Override
    public Double visitVariable(calculatorParser.VariableContext ctx) {
        String id = ctx.VARIABLE().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0.0;
    }

    /** Braces */
    @Override
    public Double visitBraces(calculatorParser.BracesContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    /** LOG'('expr',' expr')' */
    @Override
    public Double visitLogarithm(calculatorParser.LogarithmContext ctx) {
        double a = visit(ctx.expr(0));  // get value of 1st subexpression
        double b = visit(ctx.expr(1)); // get value of 2nd subexpression
        return Math.log(b)/Math.log(a); 
    }

    /** LN'('expr')' */
    @Override
    public Double visitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx) {
        double a = visit(ctx.expr());  // get value of the subexpression
        return Math.log(a); 
    }


    /** SQRT'('expr')' */
    @Override
    public Double visitSquareRoot(calculatorParser.SquareRootContext ctx) {
        double value = visit(ctx.expr());  // get value of the subexpression
        return Math.sqrt(value); 
    }
	
    /** SIN'('expr')' */
    @Override
    public Double visitSine(calculatorParser.SineContext ctx) {
        double value = visit(ctx.expr());  // get value of the subexpression
        return Math.sin(value); 
    }

}
        

   
