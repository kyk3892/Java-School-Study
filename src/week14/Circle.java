package week14;

class Circle extends Shape {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	double getArea() { return 3.14*radius*radius; }
	public void draw() { System.out.println("반지름="+radius); };
	
	public static void main(String[] args) {
		Circle p = new Circle(10);
		p.paint();
	}
}
