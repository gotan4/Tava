package day11;

public class Ex01 {
/*
	문제 3]
		문제 1, 2번에서 만든 클래스를 객체로 만들어서
		각 생성자함수가 올바르게 작동하는지 실행하세요.
 */
	public Ex01() {
		// 원 10개를 만들어서 저장하자
		Circle[] won = new Circle[10];
		for(int i = 0; i < won.length; i++) {
			if(i < 5) {
				won[i] = new Circle((int)(Math.random()*16) + 5);
				
			}else {
				won[i] = new Circle();
			}
			
		}
		//원 출력하기
		for(int i = 0; i < won.length ; i++) {
			won[i].toPrint();
			
		}
		//성적 클래스 만들기
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("우현우");
		score[2] = new Score("팽순이", 100, 100, 100, 100, 95, 80);
		
		// 출력하기
		for (int i = 0; i < score.length; i++) {
			score[i].toPrint();
		}
		
	
	}
		
	
	public static void main(String[] args) {
		new Ex01();
	}
}
