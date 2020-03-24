package day12;

public class Test04 {
	private int no1;
	int no2;
	protected int no3;
	public int no4;

	public void setNo1(int no1) {
		this.no1 = no1;

	}

	public final int getNo1() {
		System.out.println(no1 + " | " + no2 + " | " + no3 + " | " + no4);
		return 1;
	}
}
