package day12;


public class Ex02 {
	private String name;
	private int java;
	private int db;
	private int html;
	private int js;
	private int css;
	private int sum;
	private double avg;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void Stud() {
	
	}
	
	public void Stud(String name) {
		this.name = name;
		setRandom();
		toPrint();
	}
	
	public void setRandom() {
		java = (int)(Math.random()*41+60);
		db = (int)(Math.random()*41+60);
		html = (int)(Math.random()*41+60);
		js = (int)(Math.random()*41+60);
		css = (int)(Math.random()*41+60);
		sum = java + db+ html+js+css;
		avg = (sum/5.);
	}
	public void toPrint() {
		for (int i = 0; i < 5; i++) {
			int name = 'A';
			name++;
			System.out.println((char)name +" | "+ java+" | "+db+" | "+html+" | "+js+" | "+css+" | "+sum+" | "+avg);
		}
		
	}

	

}
