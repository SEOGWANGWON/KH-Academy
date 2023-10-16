package com.kh.instance.tv;
		   //객체
public class Tv {
	// Tv 제작
	// Tv 속성
	String color;  // 색상      
	boolean power; // 전원 상태
	int channel; // 채널
	// TV 기능(메서드)
	
	public void power() {
		power = !power; // 전원상태
	}
	public void channelUp() {
		++channel;
	}

	public void channelDown() {
		--channel;
	}
}
