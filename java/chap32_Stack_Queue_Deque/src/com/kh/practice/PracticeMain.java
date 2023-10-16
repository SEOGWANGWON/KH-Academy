package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// pm.practiceStack();
		pm.practiceQueue();
		
		
	}
	
	public void practiceStack() {
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
				Stack<Integer> st = new Stack<>();
				
				st.push(15);
				st.push(10);
				st.push(500);
				st.push(35);
				System.out.println(st);
				st.pop();
				System.out.println(st);
				
				st.clear();
				System.out.println(st);
				st.push(52);
				st.push(18);
				st.push(88);
				System.out.println(st);
				st.size();
				System.out.println(st.size());
				st.peek();
				System.out.println(st.peek());
				st.empty();
				System.out.println(st.empty());
				st.contains(18);
				System.out.println(st.contains(18));
				st.contains(500);
				System.out.println(st.contains(500));
		
		
	}
	public void practiceQueue() {
		// 큐에 요소 추가 반환 삭제하고 while 사용해보기
		Queue<String> q = new LinkedList<>();
		
		q.offer("내 죽음을 적에게 알리지마라");
		q.offer("나랏말싸미 어쩌구");
		q.offer("너 자신을 알라");
		q.offer("신은 죽었따.");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.size());
		
		while(!q.isEmpty()){
			String qd = q.poll();
			System.out.println(qd);
		}
		System.out.println(q);
		
		
	}
}
