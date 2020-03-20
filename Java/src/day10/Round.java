package day10;

public class Round {
int ban;
int cir ;
int area;

public void setVal(int b) {
	
	ban = b;
	cir = (int) (2*b*3.14);
	area = (int)(b*b*3.14);
	
	

}
public void toPrint() {
	System.out.println("반지름 : "+ban+ "원둘레 : " + cir + " 원넓이 : " + area);
}
}
