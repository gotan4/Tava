package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	문제1]
 		
 		이메일을 입력받아서 
 		입력받은 문자열이 이메일 형식에 맞는지 아닌지 검사하세요.
 		이메일 형식은 
 			알파벳과 숫자로 8글자이상으로 하고 @ 도메인주소
 			
 		로 처리하세요.
 			
 			참고]
 				한글 처리 : [가-힣] - 한글은 아이디에 쓰지마세요.
 				
 				
 */
public class Ex01 {
	public Ex01() {
		String email = JOptionPane.showInputDialog("이메일 주소를 입력하세요");
		
		Pattern pattern = Pattern.compile("^[a-z0-9]{+8}*@[a-z0-9]{5}+\\.[a-z0-9]{3}$ ") ;//이메일 정규식
		
		Matcher match = pattern.matcher(email);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일입니다.");
		} else {
			JOptionPane.showMessageDialog(null, "잘못된 이메일입니다.");
		}

	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Ex01();

	}

}
