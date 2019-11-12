package com.byzx.method;

public class ScoreCalc {
	
	int java;
	int TE;
	int DB;
	
	public void total() {
		System.out.println("总分：" + (java+TE+DB));
	}
	public void avg() {
		System.out.println("平均分：" + (java+TE+DB)/3);
	}


}
