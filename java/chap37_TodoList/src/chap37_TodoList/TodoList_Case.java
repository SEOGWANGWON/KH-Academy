package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_Case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		
		Scanner sc = new Scanner(System.in);
		// 할 일 목록을 적자
		
		while (true) {
			System.out.println("안녕하세요. 할 일을 선택해주세요 : ");
			System.out.println("할 일 추가는 숫자 1을 넣어주세요.");
			System.out.println("할 일 제거는 숫자 2를 넣어주세요.");
			System.out.println("종료하시려면 숫자 3을 넣어주세요");
			System.out.println("할 일 목록을 보시려면 숫자 4를 넣어주세요");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("추가하실 할 일을 적어주세요.");
				String todoItem = sc.nextLine();
				todoMap.put(taskNum++, todoItem);
				System.out.println("할 일을 추가했습니다.");
				break;
			case 2:
				System.out.println("제거하고싶은 일의 번호를 적어주세요.");
				int removeNum = sc.nextInt();
				if(todoMap.containsKey(removeNum)) {
					todoMap.remove(removeNum);
					System.out.println("할 일을 제거했습니다.");
				}else {
					System.out.println("올바르지 않은 번호입니다.");
					
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				break;
			case 4:
				System.out.println("할일 목록 입니다.");
				for(Map.Entry<Integer,String> list : todoMap.entrySet()) {
					System.out.println(list);
				}
				break;
			default:
				System.out.println("올바르지 않은 번호입니다.");
				
			}
			
			
		}
		
		
		
	}
}
