package day10;

public class Test01 {
	
	public int plus(int no1, int no2) {
		int sum = no1 +no2;
		
		return sum +10;
	}
	public static void main(String[] args) {
		Test01 t1 = new Test01();
//		System.out.println(t1.plus(2, 3).sum);
		System.out.println(t1.plus(2, 3));
		
	}

}
