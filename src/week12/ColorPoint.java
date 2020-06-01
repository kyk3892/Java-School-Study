package week12;

//point를 상속받은 ColorPoint 선언
public class ColorPoint extends Point{
	private String color;

	public ColorPoint(int x, int y, String color) {
		this.x = x; //this또는 super가능
		super.y = y;
		this.color = color;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
