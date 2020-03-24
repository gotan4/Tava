package day12;


public class Test01 {

	public static void main(String[] args) {
		Object[] obj = { 'A', 10, true };

		System.out.println((int) obj[1] + 5);

		for (int i = 0; i < obj.length; i++) {
			// instanceof 라는 연산자는 객체의 소속을 밝혀줄 때 사용하는 연산자
			if (obj[i] instanceof Character) {
				System.out.println((char)((char) obj[i] + 5));
			} else if (obj[i] instanceof Integer) {
				System.out.println((int) obj[i] + 10);
			} else if (obj[i] instanceof Boolean) {
				System.out.println((boolean) obj[i]);
			}
		}
		java.util.Scanner sc = new java.util.Scanner(System.in);
	}
}
