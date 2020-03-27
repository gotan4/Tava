package day15;

public class Test01 {
	public Test01() {
		Member hw = new Member();
		setMemberData(hw);
		System.out.println(hw);
		
	}
	//Member에 대이터 채워주는 함수
	public void setMemberData(Member m) {
		m.setMno(1242);
		m.setName("우현우");
		m.setId("WHW");
		m.setMail("WHW@WHW");
	}
	public static void main(String[] args) {
		new Test01();
		
	}

}
