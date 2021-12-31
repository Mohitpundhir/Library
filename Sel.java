package com.example.demo;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Sel {

        public static void main(String[] args) {
            
               
                ExpressionParser parser = new SpelExpressionParser();
                int two = parser.parseExpression("2+8").getValue(Integer.class); // 2
                System.out.println(two);

        }


}
