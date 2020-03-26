package day14;

public class DongleTest {
	
	public DongleTest() {
		// Dongle 객체 두개를 만들고 비교해보자.
		Dongle d1 = new Dongle(5);
		Dongle d2 = new Dongle(10);
		
		System.out.println("d1.area : " + d1.getArea());
		System.out.println("d2.area : " + d1.getArea());
		// 두 원이 같은지 비교해보자.
		System.out.println("d1과 d2는 " + ((d1.equals(d2))?("같은원 입니다."):("다른원 입니다.")));
		
		
	}
	
	public static void main(String[] args) {
		new DongleTest();

	}

}
