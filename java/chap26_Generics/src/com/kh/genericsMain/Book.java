package com.kh.genericsMain;

//제너릭 클래스 정의

public class Book<T> {
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	public T get() {
		return content;
	}

		
		
	

}
