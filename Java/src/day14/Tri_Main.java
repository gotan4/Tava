package day14;

import javax.swing.JOptionPane;

public class Tri_Main {

	public Tri_Main() {
		String t1 = JOptionPane.showInputDialog("밑변을 입력하세요");
		String t2 = JOptionPane.showInputDialog("높이을 입력하세요");

		int mit1 = Integer.parseInt(t1);
		int mit2 = Integer.parseInt(t2);
		JOptionPane.showMessageDialog(null, "t1과 t2는 " + ((t1.equals(t2))?("같은삼각형 입니다."):("다른삼각형 입니다.")));
	
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Tri_Main();
	}

}
