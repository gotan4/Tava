package day05;

/*
		8.
		    1
		   12
		  123
		 1234
		12345
 */
public class Test08 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++ ) {
			
			for(int j = 0 ; j < 5 ; j++ ) {
				if(3-j < i ) {
					System.out.printf("%3d", i + j - 3);
				} else {
					System.out.printf("%3s", " ");
				}
			}
			System.out.println();
		}
	}

}
