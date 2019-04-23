// Kevin Lin 110277459
import java.util.*;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		Scanner stdin = new Scanner(System.in);
		boolean currentPlayer = true; // true is red, false is yellow;
		while(!game.gameStatus()) {
			if(currentPlayer) {
				System.out.print("Drop a red disk at a column (0-6): ");
				if(game.putPiece('R', stdin.nextInt())) {
					currentPlayer = !currentPlayer;	
				}else {
					System.out.print("Drop a red disk at a column (0-6): ");
					System.out.println();
				}
			}else {
				System.out.print("Drop a Yellow disk at a column (0-6): ");
				if(game.putPiece('Y', stdin.nextInt())) {
					currentPlayer = !currentPlayer;	
				}else {
					System.out.print("Drop a Yellow disk at a column (0-6): ");
					System.out.println();
				}
			}
			game.printBoard();
		}
		
	}
	static class Game{
		private char m[][] = new char[6][7];
		public Game(){};
		public boolean putPiece(char color, int column) {
			if(column > 6 || column < 0) {
				System.out.print("Error, column out of bounds\n");
				return false;
			}else {
				if(m[0][column] != '\u0000') {
					System.out.print("This column is full\n");
					return false;
				}else {
				for(int i = 5; i >= 0; i--) {
					if(m[i][column] == '\u0000') {
						m[i][column] = color;
						break;
					}
				}
				}
			}
			return true;
		}
		
		public boolean gameStatus() {
			char color = m[0][0];
			int consecutives = 1;
			// First check horizontals;
			for(int i = 0; i< 6 ; i++) {
				for(int j = 0; j< 7; j++) {
					if(consecutives == 4) {
						System.out.println("The " + (color == 'R' ? "red " : "yellow ")  + " player has won");
						return true;
					}
					if(m[i][j] == color && color != '\u0000' ) {
						consecutives++;
					}else {
						color = m[i][j];
						consecutives = 1;
					}
				}
				consecutives = 1;
			}
			// Now check verticals
			for(int i = 0; i< 7 ; i++) {
				for(int j = 0; j< 6; j++) {
					if(consecutives == 4) {
						System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
						return true;
					}
					if(m[j][i] == color && color != '\u0000') {
						consecutives++;
					}else {
						color = m[j][i];
						consecutives = 1;
					}
				}
				consecutives = 1;
			}
			return false;
			
		};
		public void printBoard() {
			for(int i = 0; i<m.length; i++) {
				for(int j = 0; j<m[0].length; j++) {
					if(m[i][j] == '\u0000') {
						System.out.print(" |  ");
					}else {
					System.out.print(" | "+ m[i][j]);
					}
				}
				System.out.print(" |");
				System.out.println();
			}
			System.out.println("...............................");
		}
	}

}
