package com.example.demo;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;


public class Math {  //If then Else with Math Parser Library

            public static void main(String[] args) {
                
 

            Argument x = new Argument("x = 90"); // Pass Argument as X with value 90


                Expression ex = new Expression("if(sin(x) > 0.5, 1, 0)", x);  // Compare sin(X) value  

                        
                        System.out.println(ex.calculate()); // Calculate Expression with calculate Method


            }
    
}
