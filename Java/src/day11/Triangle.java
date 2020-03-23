package day11;

public class Triangle extends Dohyung {
	int base,height;
	
	
	public void Triangle() {
		this.base = 5;
		this.height = 6;
		setArea();
	}
	
	public void setArea() {
		area = (base * height)/2;
		
	}
	public void toPrint() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + area);
	}
	

}
