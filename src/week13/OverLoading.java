package week13;

class Sum{
	public int getSum(int i, int j) {
		return i+j;
	}
	public int getSum(int i, int j, int k) {
		return i+j+k;
	}
}
public class OverLoading {
	Sum a = new Sum();
	int i = a.getSum(1, 2);
	int j = a.getSum(1, 2, 3);
}
