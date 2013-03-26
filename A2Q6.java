import java.util.Scanner;

/*
 * Andrew Codispoti
 * Mrs. Hofstatter
 * ICS3U
 * PegBoard
 * This program will prompt the user to enter a number of rows and columns and then the position of the peg which will be placed
 */
public class A2Q6 {
	//declare the variable which will hold the standard row size
	static String firstrow = "";
	//declare the variable which will hold the String equivalent of the special row
	static String specialrow = "";

	public static void main(String[] args) {
		// declare variables
		int rows;
		int columns;
		int greaternumber;
		int x, y;
		Scanner scanner = new Scanner(System.in);

		// get number of rows and colums then draw full board
		rows = getNumberOfRows(scanner);
		columns = getNumberOfColumns(scanner);
		// determine the length of a standard row
		for (int u = 0; u < columns; u++) {
			firstrow += "#";
		}
		// draw the board
		drawBoard(rows, columns);
		// obtain input from user for the rows and columns the peg is on
		y = getPegRow(scanner);
		x = getPegColumn(scanner);

		// draw the first part of the special row
		for (int i = 0; i < x - 1; i++) {
			specialrow += "#";
		}
		// determine how many spaces are left to fill on the first row
		int remainder = columns - x;
		// add the marker to the row
		specialrow += "X";
		// fill the remainder of the row
		for (int i = 0; i < remainder; i++) {
			specialrow += "#";
		}
		System.out.println("Here is your board");
		// draw the board with the peg
		drawBoardWithPeg(x, y, columns, rows);
	}

	/*
	 * draws a blank board gets amount of rows and columns from user input
	 */
	private static void drawBoard(int rows, int columns) {

		for (int i = 0; i < rows; i++) {

			System.out.println(firstrow);

		}
	}

	// draws the board with the peg
	private static void drawBoardWithPeg(int x, int y, int column, int row) {
		for (int i = 0; i < y - 1; i++) {
			System.out.println(firstrow);
		}
		System.out.println(specialrow);
		int remainder = row - y;
		for (int i = 0; i < remainder; i++) {
			System.out.println(firstrow);
		}
	}

	// methods to get user input for the rows and peg
	private static int getNumberOfRows(Scanner scanner) {
		int rows;
		System.out.println("Number of rows: ");
		rows = scanner.nextInt();
		return rows;
	}

	private static int getNumberOfColumns(Scanner scanner) {
		int columns;
		System.out.println("Number of Columns: ");
		columns = scanner.nextInt();
		return columns;
	}

	private static int getPegRow(Scanner scanner) {
		int y;
		System.out.println("Please enter the row that the peg is on: ");
		y = scanner.nextInt();
		return y;
	}

	private static int getPegColumn(Scanner scanner) {
		int x;
		System.out.println("Please enter the column that the peg is on: ");
		x = scanner.nextInt();
		return x;
	}
}
