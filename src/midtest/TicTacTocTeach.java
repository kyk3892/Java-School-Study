package midtest;

import java.util.Scanner;

public class TicTacTocTeach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final char BLANK = ' ';
		final char COMPUTER = 'O';
		final char PLAYER = 'X';
		char[][] board = new char[3][3];
		int x,y;
		//보드 초기화
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = BLANK;
			}
		}
		do {
			//보드의 내용을 출력
			for(int i=0; i<3; i++) {
				System.out.println(" "+board[i][0]+" | "+board[i][1]+" | "+board[i][2]);
				if(i!=2) {
					System.out.println("---|---|---");
				}
			}
			
			//게임 유저의 입력을 받는 부분
			System.out.println("다음 수의 좌표를 입력하시오:");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(board[x][y]!=BLANK || (x<0) || x>2 || y<0 || y>2) {
				System.out.println("잘못된 위치입니다.");
				continue; //잘못된 위치이므로 값을 다시 받아야함
			}
			else {
				board[x][y] = PLAYER;
				//교수님같으면 여기다 판정문을 작성하겠다 제대로 들어간 경우니까 플레이어가 이겼는지
				/*
				 * for(int i=0; i<3; i++) { if(board[i][0] == PLAYER && board[i][1] == PLAYER &&
				 * board[i][2] == PLAYER) { System.out.println("플레이어가 이겼습니다."); return; }
				 * 
				 * }
				 */
			}
			
			//컴퓨터가 놓을 자리를 찾아서 'O'으로 넣어준다.
			int i=0, j=0;
			boolean found = false;
			for(i=0; i<3 && found == false; i++) { //found==false 빠져나오기 위해
				for(j=0; j<3; j++) {
					if(board[i][j] == BLANK) {
						board[i][j] = COMPUTER;
						found = true;
						// 컴퓨터가 이겼는지 사용자가 이겼는지 판정코드 들어가야함
						/*
						 * for(int i=0; i<3; i++) { if(board[i][0] == COMPUTER && board[i][1] ==
						 * COMPUTER && board[i][2] == COMPUTER) { System.out.println("컴퓨터가 이겼습니다.");
						 * return; }
						 * 
						 * }
						 */
						break;
					}
				}
			}
			//판정코드
		}while(true);

	}
	/*public boolean checkWin(int who, int i, int j) { //computer인지 player인지 호출
		boolean result = false;
		if((board[i][0] == who && board[i][1] == who && board[i][2] == who)
		   (board[0][j] == who && board[1][j] == who && board[2][j] == who)
		   (board[0][0] == who && board[1][1] == who && board[2][2] == who)
		   (board[0][2] == who && board[1][1] == who && board[2][0] == who)) {
			result = true;
		}
	}*/
	//boolean win = checkWin(PLAYER, i, j); - 판정문 메소드 사용

}

