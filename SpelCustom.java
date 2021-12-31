package com.example.demo;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


public class SpelCustom  {  //Custom Function with Spring Expression Library
	public static void main(String[] args) throws SecurityException, NoSuchMethodException {
		ExpressionParser parser = new SpelExpressionParser();
		
        StandardEvaluationContext seContext = new StandardEvaluationContext();
    
        seContext.registerFunction("getStringLen",SpelCustom.class.getDeclaredMethod("getStringLen",        //Register a function
          new Class[] { String.class }));
		Integer len =  parser.parseExpression("#getStringLen('concretepage.com')").getValue(seContext, Integer.class); //call a custom function 
		System.out.println(len);
	}

    public static int getStringLen(String str) {    // Custom function
	    return str.length()+10;
	  }
    }

