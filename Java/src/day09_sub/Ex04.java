package day09_sub;

/*
	1 2 3 4 10
	3 4 5 6 18
	5 6 7 8 26
 */
public class Ex04 {

	public static void main(String[] args) {
		for(int i = 0 ; i < 3 ; i++ ) {
			int sum = 0;
			for(int j = 0 ; j < 5 ; j++ ) {
				int no = 2 * i + j + 1;
				
				if(j == 4) {
					no = sum;
				} else {
					sum += no;
				}
				
				System.out.printf("%3d", no);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int i = 0 ; i < 3 ; i++ ) {
			int sum = 0;
			for(int j = 0 ; j < 5 ; j++ ) {
				int no = 2 * i + j + 1;
				if(j == 4) {
					no = i * 8 + 10;
				}
				System.out.printf("%3d", no);
			}
			System.out.println();
		}
	}

}
