package day10;

/*
 문제 3]
	
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고
	총점, 평균을 계산해서 입력할 클래스를 제작하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 만들어서 처리하세요
	그리고 5명의 학생을 배열로 만들어서 과목 점수, 이름을 입력해서
	출력하세요.
	 
 */
public class Sub5 {
	// 멤버 변수 선언
	String name;
	int kor, eng, math, phys, cod;

	public Sub5() {
	}

	public Sub5(String name) {
		this.name = name;
		this.kor = (int) (Math.random() * 41 + 60);
		this.eng = (int) (Math.random() * 41 + 60);
		this.math = (int) (Math.random() * 41 + 60);
		this.phys = (int) (Math.random() * 41 + 60);
		this.cod = (int) (Math.random() * 41 + 60);

	}

	public int getSum() {
		return kor + eng + math + phys + cod;
	}

	// 평균 구해주는 함수
	public double getAvg() {
		return getSum() / 5.;
	}

	public void toPrint() {
		System.out.printf("%5s : %5s\n", "이 름", name);
		System.out.printf("%5s : %5d\n", "국 어", kor);
		System.out.printf("%5s : %5d\n", "영 어", eng);
		System.out.printf("%5s : %5d\n", "수 학", math);
		System.out.printf("%5s : %5d\n", "물 리", phys);
		System.out.printf("%5s : %5d\n", "코 딩", cod);
		System.out.printf("%5s : %5d\n", "총 점", getSum());
		System.out.printf("%5s : %5.2f\n", "평 균", getAvg());
		for (int i = 0; i < 13; i++)
			System.out.print("--");
		System.out.println();

	}
	
}

