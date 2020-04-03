package day18;

import java.io.*;
import java.util.*;
public class Test01 {
/*
	Sample.txt 파일을 읽어서 Map으로 저장해보자.
 */
	public Test01() {
		// Properties 변수 만들고
		Properties prop = new Properties();
		// 외부 파일과 연결할 예정이다.
		// 이 작업은 오후에 할 예정인 IO에서 정확히 공부하자.
		// 일단 묻지마 코딩...
		FileInputStream fin = null; // 파일이 없는 경우는 예외가 발생할 것이기 때문에 일단  null 로 초기화해주고
									// try 블럭에서 변수에 데이터를 셋팅한다.
		try {
			fin = new FileInputStream("src/day18/Sample_ko.txt");
			// 경로는 절대 경로를 사용해서 우리가 현재 작업하는 폴더를 (d:\class\Java\git\Java00\src\day18\Sample.txt)로 설정해도 무방하다.
			// 이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 처리하므로
			// 위의 경우처럼 프로젝트 내부의 경로를 찾아주면 된다.
			
			// 이제 이 파일의 내용을 Properties가 읽도록한다.
			prop.load(fin);
			// load 함수가 실행되는 순간 파일의 내용을 읽어서 Map으로 처리를 해놓았다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이제부터는 마치 HashMap에 데이터가 저장된 것처럼 사용하면 된다.
		// Properties파일은 안의 내용이 = 을 기준으로 왼쪽은 키값이 되고 오른쪽은 데이터가 된다.
		//		id=increpas-cls2	라고 하면 map.put("id", "increpas-cls2") 라고 입력한 것과 같은 결과다.
		String name = (String) prop.get("name");
		System.out.println("성현씨 짝궁 이름 : " + name);
		System.out.println("성현씨 짝궁 나이 : " + (String)prop.get("age"));
		System.out.println("성현씨 짝궁 연락처 : " + (String)prop.get("tel"));
		System.out.println("성현씨 짝궁 주  소 : " + (String)prop.get("add"));
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
