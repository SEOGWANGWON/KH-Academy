package com.kh.foodStroe;

import java.util.ArrayList;
import java.util.List;

public class Order2 implements FoodStore{
	private List<Menu> OrderMenus2;

	public Order2() {
		OrderMenus2 = new ArrayList<>(); // �ֹ� ����
	}
	
	@Override  // FoodStore
	public void addMenu(String menu) {
		Menu menuB = new Menu(menu);
		OrderMenus2.add(menuB);
	}
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("�ֹ� ����");
		// manuA.getItem();   -- �ȵǴ� ����
		for(Menu menuB : OrderMenus2){
		System.out.println(menuB.getItem());
		// OrderMenus.addAll(OrderMenus);
		}
	}
}

