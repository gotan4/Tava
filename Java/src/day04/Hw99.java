package day04;

import java.util.Scanner;

/*
	반복문을 사용해서 다음 모양을 출력하세요.
	
		1. 
			*
			**
			***
			****
			*****
		
		2.
			    *
			   **
			  ***
			 ****
			*****
		
		3. 
			*****
			****
			***
			**
			*
		
		4. 
			*****
			 ****
			  ***
			   **
			    *
			    
		5. 
			    *
			   ***
			  *****
			 *******
			*********
			
		6.
			    *
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		
		7-0.
			    12345
			    12345
			    12345
			    12345
			    
		7-1.
				1  2  3  4  5
				6  7  8  9  10
				11 12 13 14 15
				16 17 18 19 20
				21 22 23 24 25
		
		7.
			1
			12
			123
			1234
			12345
			
		8.
			    1
			   12
			  123
			 1234
			12345
			
		9.
			12345
			1234
			123
			12
			1
			
		10.
			1
			2  3
			4  5  6
			7  8  9  10
			11 12 13 14 15
			
	00. ==> 반복문 중첩해서...
			1  1  1  1  1
			2  2  2  2  2
			3  3  3  3  3
			4  4  4  4  4
			5  5  5  5  5 
			
		00 - 01. ==> 반복문 중첩해서...
		
			1  1  1  1  2
			2  2  2  3  3
			3  3  4  4  4
			4  5  5  5  5
			6  6  6  6  6
		
		11.
			2 x 1 = 2 	3 x 1 = 3 	...		9 x 1 = 9
			...
			2 x 9 = 18	3 x 9 = 27	...		9 x 9 = 81
		
		12.
			
			A B C D E
			F G H I J
			K L M N O
			P Q R S T
			U V W X Y
		
		13.
			
			A
			B C
			D E F
			G H I J
			K L M N O
		
 */
public class Hw99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 문제를 출력하시겠습니까? : ");
		int code = sc.nextInt();
		System.out.println();

		switch (code) {
		case 1:
			System.out.println("1. ");
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("☆");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println();
			System.out.println("2. ");
			for (int i = 1; i <= 5; i++) {
				for (int j = 5; j > i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");

				}
				System.out.println();

			}
			break;
		case 3:
			System.out.println("3. ");
			for (int i = 5; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 4:

			System.out.println("4.");
			for (int i = 0; i <= 5; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");

				}
				for (int k = 5; k > i; k--) {
					System.out.print("*");

				}
				System.out.println();
			}
			break;
		case 5:
			System.out.println("5. ");
			for (int i = 0; i < 5; i++) {
				for (int j = 1; j < 5 - i; j++) {
					System.out.print(" ");

				}
				for (int k = 0; k < i * 2 + 1; k++) {
					System.out.print("*");

				}
				System.out.println();

			}
			break;
		case 6:
			System.out.println("꽝");
			break;
		case 7:
			System.out.println("7. ");

			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);

				}
				System.out.println();
			}
			System.out.println();
			System.out.println("7-0. "); {
			for (int j = 1; j < 5; j++) {
				for (int i = 1; i < 6; i++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
			System.out.println();
			System.out.println("##### 7-1. ");
			int num = 1;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(num++ + " ");
				}
				System.out.println();
			}
			break;
		case 8:
			System.out.println("8.");
			for (int i = 1; i <= 5; i++) {
				for (int k = 5; k > i; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j);

				}

				System.out.println();
			}
			break;
		case 9:
			System.out.println("9. ");
			for (int i = 5; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();

			}
		case 10:
			System.out.println("10. ");
			int num1 = 1;
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(num1++ + " ");
				}
				System.out.println();
			}
			break;
		case 11:
			System.out.println("11. ");

			for (int i = 1; i < 10; i++) {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
				System.out.println();

			}
			break;
		case 12:
			System.out.println("12");
			char alpa = 'A';
			for (int i = 0; i < 5; i++) {
				for (char j = 0; j < 5; j++) {
					System.out.print(alpa++ + " ");

				}
				System.out.println();

			}
			break;
		case 13:
			System.out.println("13");
			char alpa1 = 'A';
			for (int i = 0; i <= 5; i++) {
				for (char j = 0; j < i; j++) {
					System.out.print(alpa1++ + " ");

				}
				System.out.println();

			}
			break;
		case 14:
			System.out.println("14. ");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.printf("%3d", (i + 1) + 5 * j);
				}
				System.out.println();

			}
			break;
		case 00:
			System.out.println("00. ");
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(i + " ");

				}
				System.out.println();

			}
			for (int i = 1; i <= 5; i++) {
				for (int k = 5; k > i; k--) {
					System.out.print(i);
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(i + 1);

				}

				System.out.println();
			}

		}
	}
}

/*
 * for (int i = 4; i >= 0; i--) {// i 가 4부터 0까지 1씩 감소 // System.out.print(i);
 * for (int j = 0; j < 9 - i; j++) { // j 가 0 부터 9-i까지 1씩 증가 //
 * System.out.print(j+"?"+i+"|"); // System.out.print(j);
 * 
 * // System.out.print(j < i ? " " : "*"); } System.out.println();
 * 
 * }
 */
