package com.kh.example.practice4.run;

import com.kh.example.practice2.model.vo.Product2;


public class Run2 {
	public static void main(String[] agrs) {
	Product2 product = new Product2("������ z����5",2700000,"SAMSUNG");
	Product2 product1 = new Product2("ũ��ġ�� ���̱�",4200,"�ѷ��긣");
	Product2 product2 = new Product2("�ͱ� ��â�� 500g",60000,"JAPAN");
	
	product.information();
	product1.information();
	product2.information();
}
}
