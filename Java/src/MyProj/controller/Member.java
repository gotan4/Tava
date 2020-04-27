package MyProj.controller;

import javax.swing.*;

import MyProj.VO.*;
import MyProj.DAO.*;

public class Member {
	MemberDAO mDAO;
	public Member() {
		mDAO = new MemberDAO();
		
		// 회원번호로 정보조회
		getMemb();
	}
	
	// 모든 회원 정보 가져오는 함수
	public void getMembAll() {
		// 이함수는 Member테이블의 모든 회원에 대한 정보를 보여주는 함수이다.
		// 이 부분은 각자 해결해보도록 하세요!
	}
	
	// 회원 정보 조회 처리 함수
	public void getMemb() {
		int mno = 0;
		while(true) {
			String sno = JOptionPane.showInputDialog("조회할 회원의 번호를 입력하세요!\n종료는 q를 입력하세요!");
			// "q" 가 입력되면 종료 처리
			if(sno.equals("q")) break;
			
			try {
				mno = Integer.parseInt(sno);
				MemberVO mVO = mDAO.getMembInfo(mno);
				
				String name = mVO.getName();
				String mid = mVO.getId();
				String mail = mVO.getMail();
				String gen = mVO.getGen().equals("F") ? "여자" : "남자";
				String tel = mVO.getTel();
				int ano = mVO.getAno();
				String sDate = mVO.getsDate();
				
				// 보여주고
				JOptionPane.showMessageDialog(null, "<html><b style=\"color: blue;\">###  &nbsp;&nbsp;" + 
														name + " "+ getHoching(name) + " 정보 &nbsp;&nbsp;###</b></html>" + 
						"\n회원번호 : " + mno + "\n회원I D : " + mid + "\n회원메일 : " + mail + 
						"\n회원성별 : " + gen + "\n회원전화 : " + tel + "\n아바타번호 : " + ano +
						"\n가 입 일 : " + sDate
						);
			} catch(Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "잘못된 회원번호 입니다.");
				continue;
			}
		}
	}
	
	// 호칭 처리 전담 함수
	public String getHoching(String name) {
		String hoching = "";
		switch(name) {
		case "전은석":
			hoching = "선생님";
			break;
		case "김수진":
			hoching = "회장님";
			break;
		case "김소영":
			hoching = "큰손";
			break;
		case "최두용":
			hoching = "반장님";
			break;
		case "손은진":
			hoching = "대리";
			break;
		default:
			hoching = "씨";
		}
		
		return hoching;
	}
	
	public static void main(String[] args) {
		new Member();
	}

}
