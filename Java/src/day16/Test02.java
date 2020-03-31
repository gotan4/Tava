package day16;

// SimpleDateFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test02 {

	public Test02() {
		// Calendar 클래스로 현재 시간을 기억한 변수를 만들어보자.
		Calendar cal = Calendar.getInstance();
		
		// Calendar 데이터는 Date 타입으로 변환 시킬때 getTime()를 사용해서 변환시킨다.
		Date date = cal.getTime();
		
		// 출력 문자열 반환받고
		String sTime = getStr(date);
		
		// JOptionPane으로 출력하고
		JOptionPane.showMessageDialog(null, date);
		JOptionPane.showMessageDialog(null, sTime);
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// Date 타입의 데이터를 입력하면 형식에 맞도록 문자열로 만들어서 반환해주는 함수
	public String getStr(Date date) {
		// 패턴 만들고
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		// 만들어 패턴으로 문자열 데이터 만들고
		String result = form.format(date);
		
		// 넘겨주고...
		return result;
	}

}
