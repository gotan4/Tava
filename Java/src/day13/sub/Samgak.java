package day13.sub;

public class Samgak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	public Samgak() {
		
	}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("", width, height, area);
	}

}
