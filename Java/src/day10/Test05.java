package day10;

/**
 * 	이 클래스는 가변인수 테스트 클래스
 * @author	전은석
 * @since	2020.03.20
 * @version	v.1.0
 *
 */
public class Test05 {
	
	public Test05() {
		System.out.println(1);
		System.out.println("인원 수 : " + getCnt("유태희", "정우승", "박광호", "박기윤", "서동혁"));
		System.out.println(2);
	}
	
	
	// 이름들을 입력하면 인원수를 반환해주는 함수
	public int getCnt(String...name) {
		System.out.println(3);
		System.out.println(name[1]);
		return name.length;
	}
	
	public static void main(String[] args) {
		System.out.println(4);
		new Test05();
		System.out.println(5);
	}

}
