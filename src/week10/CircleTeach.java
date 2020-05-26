package week10;

public class CircleTeach {
	//멤버 변수 선언 - 멤버함수에서 모두 사용가능, 따라서 객체 안에서의 전역변수 global
	int radius;
	String name;
	
	//멤버 함수 선언
	
	//생성자
	public CircleTeach(int r, String n) {
		radius = r; name = n;
	}
	public double getArea() { //리턴값 있어야 함
		return 3.141592*radius*radius;
	} //여기까지 클래스 선언
	public void print() {
		System.out.println(name+"의 면적은 "+getArea()+"입니다");
	}

}
