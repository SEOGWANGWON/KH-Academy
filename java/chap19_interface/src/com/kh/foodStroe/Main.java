package com.kh.foodStroe;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] agrs) {
		//      FoodStore -> Order
		FoodStore order = new Order();
		order.addMenu("������");
		order.addMenu("���꽽");
		order.addMenu("������");
		order.printMenu();
		
		FoodStore oder1 = new Order();
		order.addMenu(null);
		order.addMenu(null);
		order.addMenu(null);
		order.addMenu(null);
		
		
	}

}
