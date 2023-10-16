package chap30_ThreadMain;

public class ThreadMain extends Thread{
/*
	Thread
		프로세스 내에서 실행되는 독립적인 실행 흐름
		멀티스레딩을 통해 여러 작업을 수행할 수 있게 함
		
 */
	
	public void run() {
		for(int i = 1; i <= 777; i++) {
			System.out.println("Thread 실행 중 : " + i);
		}
		try {
			Thread.sleep(1000);	// 1초 동안 스레드 일시정지
			System.out.println("스레드 끝났습니까?");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();
		
		// 스레드 시작
		thread1.start();
		thread2.start();
		
		// main 스레드에서 다른 작업을 수행할 수 있음
		
		try {
			thread1.join();	// thread1이 종료될 때 까지 대기
			thread2.join(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("모든 스레드 종료!");
		
		
		
	}

}
