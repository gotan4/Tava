package day13;

public class Nemo extends Figure {//Figure Ŭ������ ���� Ŭ����
	
	private int width;
	private int height;
	private double area;
	
	@Override
	public double getArea(int...val) {
		width = val[0];//val �迭�� ù��° �濡 width�� �ִ´�.
		height = val[1];//val �迭�� �ι�° �濡 height�� �ִ´�.
		area = width * height;// area�� ������ �ִ´�.
		return area;
	}
	
	@Override
	public void toPrint(int n) {//��¹�
		System.out.println((n+1) + " ] ���� : " + width + " , ���� : " + height + " �� �簢���� ���̴� " + area + " �Դϴ�." );
	}

}
