package day11;

/*
	���� 2]
		�� Ŭ������ �л� �Ѹ���
		�̸�, java, oracle, html, javascript, jsp, spring �� ������ ����� Ŭ�����̴�.
		�� Ŭ������ ��ü�� �ɶ� �����͸� �Է¹޾Ƽ� �� ������ ����̵ǰ� 
		Ŭ������ ���� �ϼ���.
		
		��, �����Ͱ� �Է��� �� �� ��� 
			�̸��� "�ڱ�ȣ" �� �ϰ�
			������ �����ϰ� ���ǰ� �ϼ���.
 */
public class Score {
	String name ;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	public Score() {
		this("�ڱ�ȣ");
	}
	
	public Score(String name) {
		/*
		this.name = name;
		this.java = (int)(Math.random()*61 + 40);
		this.oracle = (int)(Math.random()*61 + 40);
		this.html = (int)(Math.random()*61 + 40);
		this.javascript = (int)(Math.random()*61 + 40);
		this.jsp = (int)(Math.random()*61 + 40);
		this.spring = (int)(Math.random()*61 + 40);
		*/
		this(name,  (int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
					(int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
					(int)(Math.random()*61 + 40),(int)(Math.random()*61 + 40)
			);			
		
		/*
		 	getJumsoo() �Լ��� �� Ŭ������ ����̰�
		 	���Լ��� ����� �� �ִ� ������
		 	�� Ŭ������ ��ü�� �� ���Ŀ� ��� �����ϴ�.
		 	
		 	���� �� �Լ��� ���ٸ� �Ӽ��� ���� �����ϰ� �Ǹ�
		 	�����޸�
		 */
	}
	
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;
		setTotal();
		setAvg();
	}
	
	// ���� �����ִ� �Լ�
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	
	// ��� �����ִ� �Լ�
	public void setAvg() {
		this.avg = this.total / 6.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n", 
								name, java, oracle, html, javascript, jsp, spring, total, avg);
	}
}
