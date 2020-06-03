package week12;

class Circle {
	private double x,y;
	private int radius;

	public Circle(double x, double y, int radius) { //x,y,radius 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double CircleArea() { //원의 면적
		return 3.14*radius*radius;
	}
}
