package MyProj.controller;

import MyProj.DAO.*;
import MyProj.VO.*;
import java.util.*;
import javax.swing.*;
public class AddMember01 {
/*
			
		ALTER TABLE
		    member
		add(
		    joinDate Date default sysdate
		        CONSTRAINT MEMB_JOIN_NN NOT NULL
		);

 */
	public AddMember01() {
		joinSeo();
		
	}
	
	// 서동혁씨 가입 함수
	public void joinSeo() {
		// 회원 한명을 추가해 보자.
		// 회원 데이터는  VO 에 담아서 넘겨주기로 약속했으므로 VO를 준비한다.
		
		MemberVO mVO = new MemberVO();
		mVO.setName("서동혁");
		mVO.setId("sdh");
		mVO.setPw("12345");
		mVO.setMail("sdh@increpas.com");
		mVO.setGen("M");
		mVO.setTel("010-9823-5579");
		mVO.setAno(11);
		
		// 데이터는 준비 되었으니
		// 데이터베이스 처리함수를 호출해준다.
		MemberDAO mDao = new MemberDAO();
		
		// 데이터베이스 처리함수를 호출해준다.
		int cnt = mDao.addMember(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, mVO.getName() + " 님이 가입했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, mVO.getName() + " 님이 가입이 거절 되었습니다.");
		}
	}
	
	
	
	public static void main(String[] args) {
		new AddMember01();
	}

}
