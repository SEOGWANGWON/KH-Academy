package com.programmers;

import java.lang.reflect.Array;

public class Practice {
	public static void main(String[] agrs) {
		
	}
	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        Array.sort(array);
	        
	        if(array.length % 2  == 1){
	            answer = array.length / 2 + 1;
	        }
	        return answer;
	    }
	}

}
