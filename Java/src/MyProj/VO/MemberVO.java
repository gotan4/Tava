package MyProj.VO;

import java.sql.*;
import java.text.*;
public class MemberVO {
	private int mno, ano;
	private String name, id, pw, mail, tel, gen, avatar, sDate;
	private Date joinDate; // jdbc에서는 데이베이스의 날짜데이터를 가져올때 날짜와 시간을 분리해서 가져와야 한다.
	private Time joinTime;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public String getsDate() {
		return sDate;
	}
	
	public void setsDate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm");
		String str = form1.format(joinDate) + " " + form2.format(joinTime);
		
		this.sDate = str;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Time getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Time joinTime) {
		this.joinTime = joinTime;
	}
}
