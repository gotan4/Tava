package day15;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Random rand1 = new Random();

		for (int i = 0; i < 3; i++) {
			int rnd = rand1.nextInt(100);
			boolean bRnd = rand1.nextBoolean();
			System.out.println("rnd : " + rnd + ", bRnd :" + bRnd);
		}
		System.out.println();
		Random r1 = new Random(10);
		for (int i = 0; i < 3; i++) {
			int rnd = r1.nextInt(100);
			boolean bRnd = r1.nextBoolean();
			System.out.println("rnd : " + rnd + ", bRnd :" + bRnd);

		}
	}
}
