package day18;
import java.io.*;
import java.util.*;
public class Test02 {

	public Test02() {
		Properties prop = new Properties();
		// 파일 읽을 준비하고
		FileInputStream fin = null;
		
		// 파일 읽고
		try {
			fin = new FileInputStream("src/day18/Jinro.properties");
			
			//prop에 파일내용 로딩하고 
			prop.load(fin);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("진로 이웃 이름: " + prop.get("name"));
		System.out.println("진로 이웃 나이: " + prop.get("age"));
		System.out.println("진로 이웃 번호: " + prop.get("tel"));
		System.out.println("진로 이웃 주소: " + prop.get("addr"));
	}

	public static void main(String[] args) {
		new Test02();
	}

}
