package com.kh.foodStroe;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] agrs) {
		//      FoodStore -> Order
		FoodStore order = new Order();
		order.addMenu("군만두");
		order.addMenu("유산슬");
		order.addMenu("동파육");
		order.printMenu();
		
		FoodStore oder1 = new Order();
		order.addMenu(null);
		order.addMenu(null);
		order.addMenu(null);
		order.addMenu(null);
		
		
	}

}
