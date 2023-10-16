package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		//pm.practice5();
		
		
		
	}
	public void practice1() {
		// ¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		
		sb.append("¿À´Ã "); // Àú³áÀº ¹¹¸ÔÁö
		sb.append("Àú³áÀº ¹¹¸ÔÁö ");
		sb.append("´ß°¡½¿»ì ¸Ô°ÚÁö..");
		System.out.println(sb.toString());
		
		
	}
	public void practice2() {  // µÚÁı±â reverse
		// ¹®ÀÚ¿­ µÚÁı±â reverse
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer();
		
		sb.append(str);
		sb.reverse();
		System.out.println(sb.toString());
		
		
		
	}
	public void practice3() { // ¹®ÀÚ¿­ »ğÀÔ insert
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		sb.insert(10, "?");
		System.out.println(sb.toString()); 
		
	}
	public void practice4() {  // ¹®ÀÚ¿­ ´ëÃ¼ replace
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		sb.replace(3, 6, "¾ÆÄ§Àº");
		System.out.println(sb.toString());
		
		
	}
	public void practice5() { // ¹®ÀÚ¿­ »èÁ¦ delete
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		sb.delete(2, 5);
		System.out.println(sb.toString());
		
		
	}
	

}
