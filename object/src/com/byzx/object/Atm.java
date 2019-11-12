package com.byzx.object;

public class Atm {
//	编写一个ATM机 实现程序，要求能够进行存款，取款，查询，修改密码和退出等功能
//  提示：写一个ATM机类，
//  属性：账号、密码、余额；
//  方法：存款、取款、显示余额、修改密码、查询用户名和密码是否正确。
//  再写一个ATM管理类，调用ATM机的属性和方法完成登录、存款，取款，查询，
//	修改密码和退出等功能。
	String ID;
	String code1;
	String code2;
	double num0;
	double num1;
	double num2;
	public String atm(String ID,String code1) {
		if(ID.equals("8843abc") && code1.equals("120110")) {
			return "登陆成功！";
		}else {
			return "登陆失败！";
		}
	}
	public String balance(double num0) {
		this.num0 = num0;
		return "剩余金额" + num0;
	}
	public String save(double num1) {
		return "剩余金额" + (num0 + num1);
	}
	public String get(double num2) {
		if(num2<=num0) {
			return "剩余金额" + (num0-num2);
		}else {
			return "余额不足";
		}
	}
	public String amend(String code2) {
		code1 = code2;
		return "密码已经修改为" + code1;
	}

}
