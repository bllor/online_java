/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드 수행
 */

class NumberThread extends Thread{
	public void run() {
		for(int i=1;i<=26;i++) {
			System.out.print(i); 
		
		}
	}
}

public class Code251 {

	public static void main(String[] args) {
		
		Thread t = new NumberThread();
		t.start();
		for(char ch= 'A';ch<='Z';ch++) {
			System.out.print(ch);
		}
	}

}

