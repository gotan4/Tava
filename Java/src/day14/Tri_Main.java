package day14;
import java.util.*;
import javax.swing.*;

public class Tri_Main {
	
	public Tri_Main() {
		
		// 세모 클래스 객체 두개를 담을 배열
		ArrayList<Tri> list = new ArrayList<Tri>();
		
		// 밑변과 높이를 담을 리스트...
		ArrayList<Integer> iList = null;
		for(int i = 0 ; i < 2; i++ ) {
			iList = new ArrayList<Integer>();
			loop:
			for(int j = 0 ; j < 2; j++) {
				String str = (j == 0)? "밑변" : "높이";
				String tmp = JOptionPane.showInputDialog((i+1) + " ] 번째 삼각형의 " + str + "을 입력하세요!");
				if(tmp == null || tmp.equals("")) {
					int code = JOptionPane.showConfirmDialog(null, "<html><h3>프로그램을 종료하시겠습니까?</h3></html>", "### 프로그램 종료 ###", JOptionPane.YES_NO_OPTION);
					
					switch(code) {
					case JOptionPane.YES_OPTION:
//						System.out.println("********* " + JOptionPane.YES_OPTION);
						return;
					case JOptionPane.NO_OPTION:
//						System.out.println("######### " + JOptionPane.NO_OPTION);
						j--;
						continue loop;
					}
					/*
					// if else 구문으로 처리
					if(code == JOptionPane.YES_OPTION) {
//						System.out.println("********* " + JOptionPane.YES_OPTION);
						return;
					} else {
//						System.out.println("######### " + JOptionPane.NO_OPTION);
						j--;
						continue;
					}
					
					*/
				}
				int val = 0;
				try {
					val = Integer.parseInt(tmp);
					if(val < 0) throw new MinusException();
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "### 숫자형식이 아닌 문자열이 입력되었습니다. ###");
					j--;
					continue;
				} catch(MinusException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "### 음수가 입력되었습니다. ###");
					j--;
					continue;
				}
				iList.add(val);
			}
			list.add(new Tri(iList.get(0), iList.get(1)));
		}
		
		Tri s1 = list.get(0);
		Tri s2 = list.get(1);
		
		String info = "*** 첫 번째 삼각형 ***\n" + s1.toString() + "\n*** 두 번째 삼각형 ***\n" + s2.toString();
		JOptionPane.showMessageDialog(null, info);
		
		String msg = s1.equals(s2) ? "같은":"다른";
		JOptionPane.showMessageDialog(null, "두 삼각형은 서로 " + msg + " 삼각형입니다.");
	}
	public static void main(String[] args) {
		new Tri_Main();
	}

}
