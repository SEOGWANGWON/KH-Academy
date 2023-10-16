package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PracitceCollection {

	public static void main(String[] args) {
		
		PracitceCollection pc = new PracitceCollection();
		
		// pc.practiceList();
		// pc.practiceSet();
		// pc.practiceNumSet();
		pc.practiceMap();
		
		
		
		
		
	}
	public void practiceList() { // ���ڿ� �����϶� ���Ұ� ������
		List<String> strList = new ArrayList<>();
		// String add �غ��� for�� ���
		
		strList.add("�ȳ�?");
		strList.add(" �� �� Ǯ��ʹ�?");
		strList.add(" �׸� Ǯ�� ���� �ʴ�?");
		strList.add(" ���� �����ؾ���~");
		
		System.out.print("����Ʈ�� ���� �ϴ¸� : ");
		for(String ok : strList) {
			System.out.print(ok);
		}
	}
	
	public void practiceSet() {
		Set<String> strset = new HashSet<>();
		//String add �غ��� for�� ��� �ߺ��� �� add �ؾ���
		
		strset.add("����");
		strset.add("�ʺ��� �����ھ�");
		strset.add("���� �������˾�?");
		strset.add("�ʴ� set���ݾ�");
		strset.add("�̸� ��� �ι��߾�");
		strset.add("�̸� ��� �ι��߾�");
		
		System.out.print("set���� ��ȭ :");
		for(String hi : strset) {
			System.out.println(hi);
		}
		
		
	}
	public void practiceNumSet() {
		Set<Integer> numset = new HashSet<>();
		
		numset.add(1);
		numset.add(2);
		numset.add(3);
		numset.add(4);
		numset.add(5);
		numset.add(6);
		numset.add(1);
		
		System.out.println("����մϴ� : ");
		
		for (int hi : numset) {
			System.out.println(hi);
		}
		
	}
	
	public void practiceMap() {
		// Ű�� ���� �̿��ؼ� map put �Ѵ��� ���� �������� ����غ���
		Map<String, String> foodMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		foodMap.put("¥���", a);
		/*
		foodMap.put("�ػ깰��ȸ", 23000);
		foodMap.put("��緥���� ����������", 87000);
		foodMap.put("���Ⱑ�� �Ƚɽ�����ũ ������ġ", 36000);
		foodMap.put("¬������ ĳ���� ����ϰ� �ε巯�� Ǫ�Ʊ׶� �̿��� ��̰��� ����", 287000);
		*/
		for(String country : foodMap.keySet()) {
			String price = foodMap.get(country);
			System.out.println(country + " : " + price);
			
		}
		
	}

}
