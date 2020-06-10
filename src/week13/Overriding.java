 package week13;

 class Shape{
	 public Shape next;
	 public Shape() {next = null;}
	 public void draw() {
		 System.out.println("Shape");
	 }
 }
 class Line extends Shape{
	 public void draw() {
		 System.out.println("Line");
	 }
 }
 class Rect extends Shape{
	 public void draw() {
		 System.out.println("Rect");
	 }
 }
 class Circle extends Shape{
	 public void draw() {
		 System.out.println("Circle");
	 }
 }
public class Overriding {
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); //Line의 draw()실행
		paint(new Shape()); //Shape의 draw()실행
		paint(new Line()); //Line의 draw()실행
		paint(new Rect()); //Rect의 draw()실행
		paint(new Circle()); //Circle의 draw()실행
	}

}
