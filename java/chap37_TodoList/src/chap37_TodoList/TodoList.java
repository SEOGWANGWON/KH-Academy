package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList {
	private Map<Integer,String> tasks;
	private int list;
	
	public TodoList() {
		tasks = new HashMap<>();
		list = 0;
	}
	
	public void addTask(String task) {
		tasks.put(++list,task);
		
	}
	
	public void removetask(int list) {
		if(tasks.containsKey(list)) {
			tasks.remove(list);
		} else {
			System.out.println("제거할 일이 없습니다.");
		}
	}
	
	public void displayTasks() {
		System.out.println("할일 목록");
		for(Map.Entry<Integer,String> entry : tasks.entrySet()) {
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		TodoList todo = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가: add, 삭제: remove, 할일보기: list, 종료: exit 입력하세요.");
			
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todo.addTask(task);
			}else if (choice.equals("remove") || choice.equals("REMOVE")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine());
					todo.removetask(index);
				}catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			}else if (choice.equalsIgnoreCase("list")) {
				todo.displayTasks();
			} else if(choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
			
		}
		System.out.println("어플리케이션 종료");
		sc.close();
		
		
	}

}
