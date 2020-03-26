package day14;

public class Test01_main {
	String name;
	int age;
	Test01_01 t;

	/*
	 * public Test01_main() {
	 * 
	 * t = new Test01_01(); Test01 t1 = t.t1; t1.age = 24; t1.name = "È«±æµ¿";
	 * System.out.println(t1.toString());
	 * 
	 * }
	 */
	public Test01_main(int age, String name) {
		this.name = name;
		this.age = age;
		t = new Test01_01(this);
	}
	
	public static void main(String[] args) {
		Test01_main m1 = new Test01_main(24, "È«±æµ¿");
		Test01_main m2 = new Test01_main(18, "½ÉÃ»ÀÌ");
		System.out.println(m1.t.t1.toString());
		System.out.println(m2.t.t1.toString());
	}

}
