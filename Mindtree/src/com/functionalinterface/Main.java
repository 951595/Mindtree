package com.functionalinterface;

interface CalculatorFace{
	int calculate(int operand1, int operand2, String operator);
}
public class Main {

	public static void main(String[] args) {
    CalculatorFace calculator=(operand1, operand2, operator)->{  
    	if(operator=="+")
    		 return operand1+operand2;
    	if(operator=="-") {
    		//if(operand2<operand1) {
    			//throw new RuntimeException("operand2 canot be less thand operand1");
    		//}
    		return operand1-operand2;
    	}
    	if(operator=="*")
    		return operand1 * operand2;
    	if(operator=="/")
    		if(operand2==0) {
    			throw new RuntimeException("operand2 canot be zero");
    		}
    		return operand1 / operand2;
    
    };
    System.out.println(calculator.calculate(16, 17, "+"));
    System.out.println(calculator.calculate(16, 17, "-"));
    System.out.println(calculator.calculate(16, 17, "*"));
    System.out.println(calculator.calculate(16, 17, "/"));

	}

}
