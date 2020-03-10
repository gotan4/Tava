package day02;

public class Test07 {
/*
	콘솔창에 출력하는 기능을 가진 함수
		1. println(내용) - 내용을 출력해준후 줄바꿈해주는함수
		2. print(내용)	- 내용을 출력하고 줄바꿈을 하지 않는 함수
		3. printf(형식, 내용, 내용, ... ) - 내용을 형식에 맞게 출력해주는 함수
 */
	public Test07() {
		System.out.println("#############");
		System.out.println("#############");
		
		System.out.print("#############");
		System.out.print("#############\n");
		System.out.println("*********\t*********");
		System.out.println("-----------------------------------");
		
		System.out.printf("-----%5d-----", 10);
		System.out.printf("*****%7.2f*****\n", 3.141592);
		System.out.printf("%5s", "홍길동");
	}
	
	
	public static void main(String[] args) {
		new Test07();
	}

}
