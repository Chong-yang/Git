package com.byzx.object;

public class Atm {
//	��дһ��ATM�� ʵ�ֳ���Ҫ���ܹ����д�ȡ���ѯ���޸�������˳��ȹ���
//  ��ʾ��дһ��ATM���࣬
//  ���ԣ��˺š����롢��
//  ��������ȡ���ʾ���޸����롢��ѯ�û����������Ƿ���ȷ��
//  ��дһ��ATM�����࣬����ATM�������Ժͷ�����ɵ�¼����ȡ���ѯ��
//	�޸�������˳��ȹ��ܡ�
	String ID;
	String code1;
	String code2;
	double num0;
	double num1;
	double num2;
	public String atm(String ID,String code1) {
		if(ID.equals("8843abc") && code1.equals("120110")) {
			return "��½�ɹ���";
		}else {
			return "��½ʧ�ܣ�";
		}
	}
	public String balance(double num0) {
		this.num0 = num0;
		return "ʣ����" + num0;
	}
	public String save(double num1) {
		return "ʣ����" + (num0 + num1);
	}
	public String get(double num2) {
		if(num2<=num0) {
			return "ʣ����" + (num0-num2);
		}else {
			return "����";
		}
	}
	public String amend(String code2) {
		code1 = code2;
		return "�����Ѿ��޸�Ϊ" + code1;
	}

}
