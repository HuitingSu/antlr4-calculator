/**
  Calculator application using Antlr4 and jline3.
 
  -by  Huiting Su
 
**/

package org.calculator;

import java.lang.Exception;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.jline.reader.*;
import org.jline.reader.impl.completer.*;
import org.jline.utils.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;


public class calculator {
    private String[] commandsList;
    
    public void init() {
        commandsList = new String[] { "help", "exit" };
    }
   

    public void run() {
        printWelcomeMessage();
        LineReaderBuilder readerBuilder = LineReaderBuilder.builder();
        List<Completer> completors = new LinkedList<Completer>();
        
        completors.add(new StringsCompleter(commandsList));
        readerBuilder.completer(new ArgumentCompleter(completors));
        
        LineReader reader = readerBuilder.build();
        
        String line;
        PrintWriter out = new PrintWriter(System.out);
        
        while ((line = readLine(reader, "")) != null) {
           
            if ("help".equals(line)) {
                printHelp();
            } else if ("exit".equals(line)) {
                System.out.println("Exiting application");
                return;
            } else {
                if ( line!=null ) {
					String[] args = new String[]{line , "\n\u001a"};
        			ANTLRInputStream input = new ANTLRInputStream(args[0]);
            		calculatorLexer lexer = new calculatorLexer(input);
        			CommonTokenStream tokens = new CommonTokenStream(lexer);
        			calculatorParser parser = new calculatorParser(tokens);
        			ParseTree tree = parser.prog(); // parse

        			EvalVisitor eval = new EvalVisitor();
        			eval.visit(tree);
				}
			}
		}        
    }
    
    private void printWelcomeMessage() {
        System.out
        .println("Welcome to Calculator App with Antlr4. For assistance press TAB or type \"help\" then hit ENTER.");
        
    }
    
    private void printHelp() {
        System.out.println("help		- Show help");
        System.out.println("expression  - Calculate Expression");
        System.out.println("exit        - Exit the app");
        
    }
    
    private String readLine(LineReader reader, String promtMessage) {
        try {
            String line = reader.readLine(promtMessage + "\nCalculator> ");
            return line.trim();
        }
        catch (UserInterruptException e) {
            // e.g. ^C
            return null;
        }
        catch (EndOfFileException e) {
            // e.g. ^D
            return null;
        }
    }
    
    public static void main(String[] args) throws Exception{
        calculator mycalc = new calculator();
        mycalc.init();
        mycalc.run();
    }
}
