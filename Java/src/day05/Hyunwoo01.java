package day05;

/*
	AAAAA
	BBBBB
	CCCCC
	DDDDD
	EEEEE
	
	ÈùÆ®]
		System.out.print('A');
		
		char ch = (char)('A' + 1);
 */

public class Hyunwoo01 {

	public static void main(String[] args) {
		char ch = (char)('A' + 1);
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5;i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
