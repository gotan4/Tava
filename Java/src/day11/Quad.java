package day11;

public class Quad extends Dohyung {
	int garo, sero;
	
	public Quad() {
		this(1,1);
	}
	
	public Quad(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	
	public void setArea() {
		area = garo * sero;
		
	}
	public void toPrint() {
		System.out.println("사각형의 넓이는 : " +  area  );
	}
}
