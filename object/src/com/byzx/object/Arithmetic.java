package com.byzx.object;

public class Arithmetic {
	
	//��дһ���������������߱��ӡ������ˡ��������ࡢƽ���ȹ��ܣ�
	//��д������
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
			System.out.println(num1 + "��" + num2 + "=" + (num1/num2));
		}else if(symbol=='%') {
			System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
		}
	}
}
