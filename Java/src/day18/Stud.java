package day18;

public class Stud {
	private String name;
	private int num, ban, kor, eng, math, total, avg;
	public Stud() {}
	public Stud(int total, int avg) {
		setTotal();
		setAvg();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = total;
	}
	public void setTotal(int total) {
		this.total = kor + eng + math;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = avg;
	}
	public void setAvg(int avg) {
		this.avg = total/3;
	}

}
