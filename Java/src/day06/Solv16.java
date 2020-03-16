package day06;

/*
	16.
		
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		
 */
public class Solv16 {

	public static void main(String[] args) {
		int num = 1;
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ;j++ ) {
				if(i % 2 == 0) {
					System.out.printf("%3d", i * 5 + j + 1);
				} else {
					System.out.printf("%3d", i * 5 + 5 - j);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i= 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("%3d", ((j + 1) + 5 * i) * (1 - i % 2)  + (i % 2) * ((i+1) * 5 - j));
				
				/*
				if(i%2 == 0) {
					System.out.printf("%3d", (5 * i + j + 1));
				} else {
					System.out.printf("%3d", (5 * i + (5 - j)));
				}
				*/
			}
			System.out.println();
		}
	}

}
