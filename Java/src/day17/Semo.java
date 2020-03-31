package day17;

public class Stud implements Comparable {
	private String name;
	private int no;
	private int kor, eng, math, physics, cod, total;

	public Stud() {
	}

	public Stud(String name, int kor, int eng, int math, int physics, int cod) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.physics = physics;
		this.cod = cod;
		setTotal();
	}

	@Override
	public int compareTo(Object o) {
		Stud s = (Stud) o;

		int result = s.getTotal() - this.getTotal();
		return -result;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getTotal() {
		return total = total;
	}

	public void setTotal() {
		this.total = kor + eng + math + physics + cod;
		;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
