package com.example.demo;



import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;
import org.mariuszgromada.math.mxparser.mXparser;

public class MathCustom {

    public static void main(String[] args) {
        
             // funciton object with values
             Function f = new Function("f", "x^2","x"); 
        
                // Expression object with expression for calculate
                Expression e = new Expression("f(2)", f); 

                    // calculate mathod for calculate Expresion for f(2)
                     mXparser.consolePrintln("Res 1: " + e.getExpressionString() + " = " + e.calculate()); 
                        
                            // calculate mathod for calculate Expresion for f(2)
                            mXparser.consolePrintln("Res 2: f(5) = " + f.calculate(5));
        



    }

    
}
