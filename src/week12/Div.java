package week12;

public class Div {
	private int a;
	private int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		try {
			return a/b;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return 0;
	}
}
