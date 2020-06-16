package GameObject;

import java.util.Scanner;

public class Bear extends GameObject {

	private Scanner sc;
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		sc = new Scanner(System.in);
	}

	@Override
	protected void move() {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		char c;
		c = sc.next().charAt(0);
		switch(c) {
		case 'a' :
			x--;
			if(x < 0) x = 0; //0보다 작아질 수 없음
			break;
		case 'f' :
			x++;
			if(x >= Game.MAX_X) x = Game.MAX_X - 1; //판을 넘어갈 수 없음
			break;
		case 'd' :
			y--;
			if(y < 0) y = 0;
			break;
		case 's' :
			y++;
			if(y >= Game.MAX_Y) y = Game.MAX_Y - 1;
			break;
		}
	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
