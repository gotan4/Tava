package MyProj.view.event;

import java.awt.event.*;

import javax.swing.JOptionPane;

import MyProj.view.*;
import MyProj.VO.*;
import MyProj.DAO.*;

public class JoinEvt implements ActionListener {
	JoinMember main;
	MemberDAO mDAO;
	
	
	public JoinEvt() {}
	
	public JoinEvt(JoinMember main) {
		this.main = main;
		mDAO = new MemberDAO();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt = 0;
		if(getData()) {
			cnt = mDAO.insertMemb(main.mVO);
			if(cnt == 1) {
				JOptionPane.showMessageDialog(null, "[ " + main.mVO.getName() + " ] 님의 가입이 완료되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "[ " + main.mVO.getName() + " ] 님의 가입이 취소 되었습니다.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "누락된 데이터가 있습니다.");
		}
	}
	
	public boolean getData() {
		String name = main.name.getText();
		String id = main.id.getText();
		String pw = main.pw.getText();
		String tel0 = (String)main.tel0.getSelectedItem();
		String tel1 = main.tel1.getText();
		String tel2 = main.tel2. getText();
		String tel = tel0 + "-" + tel1 + "-" + tel2;
		String mail = main.mail.getText();
		System.out.println(tel);
		
		if(name != null && id != null && pw != null && tel != null && mail != null) {
			main.mVO.setName(name);
			main.mVO.setId(id);
			main.mVO.setPw(pw);
			main.mVO.setTel(tel);
			main.mVO.setMail(mail);
			
			return true;
			
		} else {
			return false;
		}
	}

}
