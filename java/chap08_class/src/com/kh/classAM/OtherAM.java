package com.kh.classAM;

public class OtherAM {
	public static void main(String[] agrs) {
		// AM 생성
		AM am = new AM();
		
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		// 
		// am.privatMethod();  다른 클래스에 존재하기 때문에 출력이 안됨. 생성한 클래스내에서만 사용가능하기 떄문.
		
		
		
		
		
		
	}
	

}
