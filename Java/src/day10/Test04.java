package day10;

public class Test04 {

	public static void main(String[] args) {
		String str = "TODO Auto-generated method stub";
		
		int idx = str.lastIndexOf('o');
		System.out.println(idx);
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " - " + i + "\n");
		}
	}

}
