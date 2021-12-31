package com.example.demo;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Ifesle { // If then Else with Spring Expression Library
    
    public static void main(String[] args) {
    
     ExpressionParser parser = new SpelExpressionParser(); 
    

    String falseString = parser.parseExpression("1>0 ? 'trueExp' : 'falseExp'").getValue(String.class); //parseExpression for calculating Expression
    
    System.out.println(falseString);

}
}
