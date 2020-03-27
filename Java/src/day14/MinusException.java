package day14;

public class MinusException extends Exception {

	public MinusException() {
		super("***** 음수가 입력되었습니다. *****");
	}

	/*
	public String toString() {
		return "음수가 입력되었습니다.";
	}
	 */
}