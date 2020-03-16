package day05;

/*
	1, 1, 2, 3, 5, ...
 */
public class Ee01 {

	public static void main(String[] args) {
		
		int no1 = 1;
		int no2 = 1;
		int tmp = 0;
		System.out.print(no1 + ", " + no2 + ", ");
		for(int i = 0 ; i < 8 ; i++ ) {
			System.out.print(no1 + no2);
			if( i != 7) {
				System.out.print(", ");
			}
			tmp = no1;
			no1 = no2;
			no2 = no1 + tmp;
		}
	}

}
