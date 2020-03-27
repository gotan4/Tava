package day15;

import java.util.Date;

public class Test08 {

	public Test08() {
		// TODO 자동 생성된 생성자 스텁
		for (int i = 0; i < 50; i++) {
			Date date = new Date();

			System.out.println(date.getHours() + " : " + date.getMinutes()+ " : " + date.getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
	
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Test08();

	}

}
