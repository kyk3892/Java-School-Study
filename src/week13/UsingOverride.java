package week13;

//Overriding의 shape, Line, Rect, Circle 클래스 활용

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;

		//도형 출력하기
		Shape p = start;
		while(p!=null) {
			p.draw();
			p = p.next;
		}
	}
}
