package day19;

/*
 	직렬화가 되기 위해서는 Serializable 을 구현해줘야 한다.
 	직렬화는 직렬화 가능한 클래스 에서만 가능하므로...
 	
 	
 */

public class Friend {
	private String name, tel, mail;
	private int age;
	private float height;
	private char gen;
	public Friend() {	}
	public Friend(String name, String tel, String mail, int age, float height, char gen) {	
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age =age;
		this.height = height;
		this.gen = gen;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	

}
