package com.byzx.object;

public class AtmTest {
	
	public static void main(String[] args) {
		Atm atm = new Atm();
		String a = atm.atm("8843abc", "120110");
		System.out.println(a);
		String b=atm.balance(800);
		System.out.println(b);
		String g=atm.get(5500);
		System.out.println(g);
		String s=atm.save(300);
		System.out.println(s);
		String c=atm.amend("110123");
		System.out.println(c);
	}
	

}
