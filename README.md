# antlr4-calculator
A calculator using antlr4. For convenience, Grammar calculator.g4 is rewote to direct left recursion instead of recursive descent.
Please see the Calc-Maven-jline3 directory for the Maven project with jline3. Run the command to see result:
```java
mvn compile exec:java
```

### Set Path and Alias
Change the directory in the following command and run.
```java
export CLASSPATH="/home/huiting/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/home/huiting/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java org.antlr.v4.gui.TestRig'
```

### Get Calculation Result

t.expr is the input file with multiple expressions. Result is shown in console.

```java
antlr4 -no-listener -visitor calculator.g4
javac Calc.java calculator*.java
java Calc t.expr
```
### Functions Supported
Power  
Multiplication and Division  
Addition and Subtraction  
Square Root  
Signed Number  
Logarithm and NaturalLogarithm  
SIN, ASIN, COS, ACOS, TAN, ATAN  

### Sample Input (t.expr)
```java
a = 5
b = 6
(a+b)*2
193
1+(4*2)^(-2)
1+4*2^2
e
log(2,5)
ln(e)
sin(pi/2)
tan(pi/3)
(1+2)*3
```

### Output
```java
22.0
193.0
1.015625
17.0
2.718281828459045
2.321928094887362
1.0
1.0
1.7320508075688767
9.0
```
