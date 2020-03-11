package day03;

public class Ex02 {
/*
 	문제 1]
 		게시판에 글을 한페이지에 15개 표시할수있다.
 		게시물의 걧수를 랜덤하게 (0 ~ 100) 발생한 후
 		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
 		단, 게시물 수가 0 인 경우는 1페이지가 필요한것으로 한다.
 */
	public Ex02() {
		//int gel = (int)(Math.random()*100);
		int gel = 0;
		int sol = gel /15;
		int page = 0;
		
		if (gel == 0) {
			
			page = 1;
		}else if (gel %15 == 0) {
			page = sol;
			
		} else {
			page = sol +1;
			

		}
		System.out.println("게시글 수 : " + gel);
		System.out.println("필요한 페이지 수는 " + page);
	}
	

	public static void main(String[] args) {
		new Ex02();
	}

}
