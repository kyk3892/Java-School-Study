package midtest;

public class PangPang { //지뢰 찾기 지뢰만 보여지는거

	public static void main(String[] args) {
		System.out.println("지뢰찾기 게임 - 지뢰만 보여지기\n");
		boolean[][] board = new boolean[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(Math.random()<0.3) {
					board[i][j] = true;
				}
			}
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(board[i][j]) {
					System.out.print("# ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}

	}

}

