package com.byzx.method;

public class ScoreCalcTest {
	
	public static void main(String[] args) {
		ScoreCalc score = new ScoreCalc();
		score.java = 90;
		score.DB = 80;
		score.TE = 70;
		score.total();
		score.avg();
	}


}
