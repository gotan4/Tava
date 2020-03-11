package day03;

public class Member {
	int mno;
	String mid;
	String mpw;
	String name;
	String tel;
	
	public Member() {
		
	}
	
	public Member(int mno, String mid, String mpw, String name,String tel) {
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.name = name;
		this.tel = tel;
	}
	/*
	public static void abc() {
		Member memb = new Member();
		memb.mno = 7000;
		memb.mid = "KING";
		memb.mpw = "12345";
		memb.name = "KING";
		
		Member m2 = new Member(7001, "sung", "12345", "김성현");
		
		System.out.println("7000번 이름 : " + memb.name);
		System.out.println("7001번 이름 : " + m2.name);
	}*/
	

}
