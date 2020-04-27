package MyProj.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

import MyProj.DAO.*;
import MyProj.VO.*;
public class MemberList extends JPanel {
	public JScrollPane pan ;
	public JTable table;
	public MemberList() {
		ArrayList<String> colList = new ArrayList<String>();
		String[] infoCol = {"회원번호", "회원아이디", "회원이름","가 입 일"};
		
		MemberDAO mDAO = new MemberDAO();
		//회원리스트 데이터 가져오고
		ArrayList<MemberVO> mList = mDAO.getAllList();
		// 가져온 데이터로 테이블만들고
		Object[][] data = new Object[mList.size()][];
		
		for(int i = 0 ; i < mList.size() ; i++ ) {
			data[i] = new Object[]{mList.get(i).getMno(), mList.get(i).getId(), mList.get(i).getName(), mList.get(i).getsDate()};
		}
		
		table = new JTable(data, infoCol);

		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		pan = new JScrollPane(table);
		pan.setPreferredSize(new Dimension(465, 442));
		
		add(pan);
	}
	

}
