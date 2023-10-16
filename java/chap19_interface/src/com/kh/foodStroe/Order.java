package com.kh.foodStroe;

import java.util.ArrayList;
import java.util.List;

public class Order implements FoodStore{
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();  // 주문한 내용
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
	}
	
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("주문 내역");
		// manuA.getItem();   -- 안되는 이유
		for(Menu menuA : OrderMenus){
		System.out.println(menuA.getItem());
		// OrderMenus.addAll(OrderMenus);
	}
	
	
}
}
