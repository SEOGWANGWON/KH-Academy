package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<Integer>{

	public static void main(String[] args) {
		//List ArrayList 생성 Comparator 정리
		List<Integer> nlist = new ArrayList<>();
		nlist.add(5);
		nlist.add(2023);
		nlist.add(7);
		nlist.add(3);
		nlist.add(9);
		nlist.add(150);
		nlist.add(427);
		
		Collections.sort(nlist, new User());
		
		for (int i : nlist) {
			System.out.println(i);
		}
		
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -1;
	}

	
}
