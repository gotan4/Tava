package day15;

import java.util.Date;

public class Test08 {

	public Test08() {
		// TODO �ڵ� ������ ������ ����
		for (int i = 0; i < 50; i++) {
			Date date = new Date();

			System.out.println(date.getHours() + " : " + date.getMinutes()+ " : " + date.getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �ڵ� ������ catch ���
				e.printStackTrace();
	
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		new Test08();

	}

}
