package week12;

public class PointApp {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");

		System.out.println("("+cp.x+","+cp.y+")"+"입니다.");
	}

}
