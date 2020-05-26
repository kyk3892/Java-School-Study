package week10;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r,t)) {
			System.out.println("t는 r을 포함합니다. ");	
		}
		if(t.contains(s,t)) {
			System.out.println("t는 s를 포함합니다.");
		}
	}

}