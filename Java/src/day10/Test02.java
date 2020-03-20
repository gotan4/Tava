package day10;

public class Test02 {
int sum;
public void setSum(int no1, int no2) {
	sum = no1 +no2;
}
	public static void main(String[] args) {
		Test02 t1 = new Test02();
		Test02 t2 = new Test02();
		
		t1.setSum(2,3);
		
//		==> 각 레퍼런스 변수에 멤버중 sum의 데이터 비교
		
		System.out.println("t1.sum : " + t1.sum);
		System.out.println("t2.sum : " + t2.sum);
		

	}

}
