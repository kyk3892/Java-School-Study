package week14;

public class B extends OddDetector{
	public B(int n) {
		super(n);
	}
	public boolean isOdd() {
		if(n%2==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		B b = new B(10);
		System.out.println(b.isOdd());
	}
	
}