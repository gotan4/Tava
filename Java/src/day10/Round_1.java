package day10;

public class Round_1 {
	Round[] round;
public void setRound() {	
	round = new Round[10];
	for (int i = 0; i < round.length; i++) {
		round[i] = new Round();
		
		int b = (int)(Math.random()*100);
		round[i].setVal(b);
	}
}

	public static void main(String[] args) {
		Round_1 r = new Round_1();
		
		r.setRound();
		
		for (int i = 0; i < r.round.length; i++) {
			r.round[i].toPrint();
		}
		System.out.println();
		System.out.println("##################");

	}

}
