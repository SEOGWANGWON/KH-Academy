package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		
		intBook.put(1004);
		intBook.put(58);
		int intValue = intBook.get(); // �� ��ȯ �ʿ� ����
		
		// ���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		
		strBook.put("����");
		strBook.put("õ��");
		strBook.put("onizzyang");
		
		String strValue = strBook.get();
		
		// ���ʸ� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� �� �ְ�
		// ����� �� ����.
		
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		
	}

}
