package day15;

import java.io.File;
import java.util.Scanner;

public class Test06 {
	public Test06() {
		File f = new File("D:\\class\\java\\git\\Tava\\Java\\src\\day15\\ScannerTest.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(f);
			String str = scan.nextLine();
			System.out.println("내 파일 내용 : " + str);
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Test06();
	}

}
