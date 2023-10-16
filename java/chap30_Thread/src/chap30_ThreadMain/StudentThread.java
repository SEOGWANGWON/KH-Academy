package chap30_ThreadMain;

public class StudentThread extends Thread {
					
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
		
		
	}
	@Override
	public void run() {
		System.out.println(studentName + "가(이) 공부를 시작합니다!!");
		for(int i = 1; i <= 300; i++) {
			System.out.println("Thread 실행 중 : " + i);
		}
		try {
			Thread.sleep(2000); // 스레드가 2초 동안 잠자기 상태로 있도록 합니다.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(studentName + "가(이) 공부를 마칩니다.");
	}
		
		
		

}
