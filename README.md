# antlr4-calculator
A calculator used antlr4

#### Set Path and Alias.
Change the directory in the following command and run.
```java
export CLASSPATH="/home/huiting/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/home/huiting/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java org.antlr.v4.gui.TestRig'
```

#### Get Calculation Result

t.expr is the input file with expressions.

```java
antlr4 -no-listener -visitor calculator.g4
javac Calc.java calculator*.java
java Calc t.expr
```
#### Functions Supported

