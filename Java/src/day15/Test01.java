package day15;

public class Test01 {
	public Test01() {
		Member hw = new Member();
		setMemberData(hw);
		System.out.println(hw);
		
	}
	//Member�� ������ ä���ִ� �Լ�
	public void setMemberData(Member m) {
		m.setMno(1242);
		m.setName("������");
		m.setId("WHW");
		m.setMail("WHW@WHW");
	}
	public static void main(String[] args) {
		new Test01();
		
	}

}
