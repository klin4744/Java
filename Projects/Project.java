
// Kevin Lin 110277459
import java.util.*;

// Add tests 22
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		Scanner stdin = new Scanner(System.in);
		boolean currentPlayer = true; // true is red, false is yellow;
		while (!game.gameStatus() && !game.boardFull()) {
			if (currentPlayer) {
				System.out.print("Drop a red disk at a column (0-6): ");
				if (game.putPiece('R', stdin.nextInt())) {
					currentPlayer = !currentPlayer;
				} else {
					System.out.print("Drop a red disk at a column (0-6): ");
					System.out.println();
				}
			} else {
				System.out.print("Drop a Yellow disk at a column (0-6): ");
				if (game.putPiece('Y', stdin.nextInt())) {
					currentPlayer = !currentPlayer;
				} else {
					System.out.print("Drop a Yellow disk at a column (0-6): ");
					System.out.println();
				}
			}
			game.printBoard();
		}
		stdin.close();

	}

	static class Game {
		private char m[][] = new char[6][7];

		public Game() {
		};

		public boolean putPiece(char color, int column) {
			try {
				if (m[0][column] != '\u0000') {
					System.out.print("This column is full\n");
					return false;
				} else {
					for (int i = 5; i >= 0; i--) {
						if (m[i][column] == '\u0000') {
							m[i][column] = color;
							break;
						}
					}
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("Error, column out of bounds\n");
				return false;
			}
			return true;
		}

		public boolean boardFull() {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (m[i][j] == '\u0000')
						return false;
				}
			}
			System.out.println("No more moves can be made on the board. ");
			return true;

		}

		public boolean gameStatus() {
			char color = m[0][0];
			int consecutives = 0;
			// First check horizontals;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (m[i][j] == color && color != '\u0000') {
						consecutives++;
					} else {
						color = m[i][j];
						consecutives = 1;
					}
					if (consecutives == 4) {
						System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
						return true;
					}
				}
				consecutives = 1;
			}
			color = m[0][0];
			consecutives = 0;
			// Now check verticals
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 6; j++) {
					if (m[j][i] == color && color != '\u0000') {
						consecutives++;
					} else {
						color = m[j][i];
						consecutives = 1;
					}
					if (consecutives == 4) {
						System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
						return true;
					}
				}
				consecutives = 1;
			}
			// Check diagonals: lots of repeats
			// Main diagonal has a length of 6 and starts at 0,0
			color = m[0][0];
			consecutives = 0;
			for (int i = 0; i < 6; i++) {
				if (m[i][i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[0][1];
			consecutives = 0;
			for (int i = 0; i < 6; i++) {
				if (m[i][i + 1] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][i + 1];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[0][2];
			consecutives = 0;
			for (int i = 0; i < 5; i++) {
				if (m[i][i + 2] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][i + 2];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[0][3];
			consecutives = 0;
			for (int i = 0; i < 4; i++) {
				if (m[i][i + 3] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][i + 3];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[1][0];
			consecutives = 0;
			for (int i = 1; i < 6; i++) {
				if (m[i][i - 1] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][i - 1];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[2][0];
			consecutives = 0;
			for (int i = 2; i < 6; i++) {
				if (m[i][i - 2] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][i - 2];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			// Reverse diagonal
			color = m[0][6];
			consecutives = 0;
			for (int i = 0; i < 6; i++) {
				if (m[i][6 - i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][6 - i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[0][5];
			consecutives = 0;
			for (int i = 0; i < 6; i++) {
				if (m[i][5 - i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][5 - i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[0][4];
			consecutives = 0;
			for (int i = 0; i < 5; i++) {
				if (m[i][4 - i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][4 - i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[0][3];
			consecutives = 0;
			for (int i = 0; i < 4; i++) {
				if (m[i][3 - i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][3 - i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[1][6];
			consecutives = 0;
			for (int i = 1; i < 6; i++) {
				if (m[i][6 - i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][6 - i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			color = m[2][6];
			consecutives = 0;
			for (int i = 2; i < 6; i++) {
				if (m[i][6 - i] == color && color != '\u0000') {
					consecutives++;
				} else {
					color = m[i][6 - i];
					consecutives = 1;
				}
				if (consecutives == 4) {
					System.out.println("The " + (color == 'R' ? "red " : "yellow ") + " player has won");
					return true;
				}
			}
			return false;

		};

		public void printBoard() {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					if (m[i][j] == '\u0000') {
						System.out.print(" |  ");
					} else {
						System.out.print(" | " + m[i][j]);
					}
				}
				System.out.print(" |");
				System.out.println();
			}
			System.out.println("...............................");
		}
	}

}
