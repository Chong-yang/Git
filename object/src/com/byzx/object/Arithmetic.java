package com.byzx.object;

public class Arithmetic {
	
	//编写一个整数计算器，具备加、减、乘、除、求余、平方等功能，
	//编写测试类
	int num1;
	int num2;
	private char symbol;
	public char getsymbol() {
		return symbol;
	}
	public void setsymbol(char symbol) {
		if(symbol == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}else if(symbol=='-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}else if(symbol=='*') {
			System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
		}else if(symbol=='/') {
			System.out.println(num1 + "÷" + num2 + "=" + (num1/num2));
		}else if(symbol=='%') {
			System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
		}
	}
}
