package day14;

public class Test01_01 {
	Test01 t1;
	
	public Test01_01() {
		t1 = new Test01();
	}
	public Test01_01(Test01_main main) {
		t1= new Test01(main.age, main.name);
	}
	
}
