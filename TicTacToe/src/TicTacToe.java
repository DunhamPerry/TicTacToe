import java.util.Scanner;

public class TicTacToe
	{
		static String a1 = " ";
		static String a2 = " ";
		static String a3 = " ";
		static String b1 = " ";
		static String b2 = " ";
		static String b3 = " ";
		static String c1 = " ";
		static String c2 = " ";
		static String c3 = " ";
		static Scanner userInput = new Scanner(System.in);
		static int finish = 0;
		static int turn = 0;
		static int winner = 0;
		public static void main(String[] args)
			{
			board();
			}
		
		public static void turns(){
			if (turn == 0) {
				playerTurn();	
			}
			else {
				enemyTurn();
			}
		}
		
		
		public static void finish(){
			for (int i = 0; i < 1;) {	
				if (finish == 1) {
					i++;
				}
				else if (finish == 0) {
					turns();
				}
			}
			System.out.println("     1     2     3  ");
			System.out.println("  -------------------");
			System.out.println("A |  " + a1 + "  |  " + a2 +"  |  "+ a3 +"  |");
			System.out.println("  -------------------");
			System.out.println("B |  " + b1 + "  |  " + b2 +"  |  "+ b3 +"  |");
			System.out.println("  -------------------");
			System.out.println("C |  " + c1 + "  |  " + c2 +"  |  "+ c3 +"  |");
			System.out.println("  -------------------");
			System.out.println("Game Over");
			if (winner == 1){
				System.out.println("O Wins");
			}
			else {
				System.out.println("X Wins");
			}
			System.exit(0);
		}
		
		public static void check(){
			if (a1 == "X" && a2 == "X" && a3 == "X"){
				finish = 1;
				finish();
			}
			else if (b1 == "X" && b2 == "X" && b3 == "X") {
				finish = 1;
				finish();
			}
			else if (c1 == "X" && c2 == "X" && c3 == "X") {
				finish = 1;
				finish();
			}
			else if (a1 == "X" && b1 == "X" && c1 == "X") {
				finish = 1;
				finish();
			}
			else if (a2 == "X" && b2 == "X" && c2 == "X") {
				finish = 1;
				finish();
			}
			else if (a3 == "X" && b3 == "X" && c3 == "X") {
				finish = 1;
				finish();
			}
			else if (a1 == "X" && b2 == "X" && c3 == "X") {
				finish = 1;
				finish();
			}
			else if (a3 == "X" && b2 == "X" && c1 == "X") {
				finish = 1;
				finish();
			}
			else if (a1 == "O" && a2 == "O" && a3 == "O"){
				finish = 1;
				winner = 1;
				finish();
			}
			else if (b1 == "O" && b2 == "O" && b3 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else if (c1 == "O" && c2 == "O" && c3 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else if (a1 == "O" && b1 == "O" && c1 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else if (a2 == "O" && b2 == "O" && c2 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else if (a3 == "O" && b3 == "O" && c3 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else if (a1 == "O" && b2 == "O" && c3 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else if (a3 == "O" && b2 == "O" && c1 == "O") {
				finish = 1;
				winner = 1;
				finish();
			}
			else {
				turns();
			}
		}
		public static void board(){
			System.out.println("     1     2     3  ");
			System.out.println("  -------------------");
			System.out.println("A |  " + a1 + "  |  " + a2 +"  |  "+ a3 +"  |");
			System.out.println("  -------------------");
			System.out.println("B |  " + b1 + "  |  " + b2 +"  |  "+ b3 +"  |");
			System.out.println("  -------------------");
			System.out.println("C |  " + c1 + "  |  " + c2 +"  |  "+ c3 +"  |");
			System.out.println("  -------------------");
			playerTurn();
		}
		public static void playerTurn(){
			System.out.println("Pick a position");
			String playerPosition = userInput.nextLine();
			switch (playerPosition) {
				case "a1":
					if (a1 == " "){
						a1 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "a2":
					if (a2 == " "){
						a2 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "a3":
					if (a3 == " "){
						a3 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "b1":
					if (b1 == " "){
						b1 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "b2":
					if (b2 == " "){
						b2 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "b3":
					if (b3 == " "){
						b3 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "c1":
					if (c1 == " "){
						c1 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "c2":
					if (c2 == " "){
						c2 = "X";
					}
					else {
						playerTurn();
					}
					break;
				case "c3":
					if (c3 == " "){
						c3 = "X";
					}
					else {
						playerTurn();
					}
					break;
			}
			turn = 1;
check();
		}
		public static void enemyTurn(){
			int enemyTurn = (int)(Math.random() * (9 * 1) + 1);
			switch (enemyTurn) {
			case 1:
				if (a1 == " "){
					a1 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 2:
				if (a2 == " "){
					a2 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 3:
				if (a3 == " "){
					a3 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 4:
				if (b1 == " "){
					b1 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 5:
				if (b2 == " "){
					b2 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 6:
				if (b3 == " "){
					b3 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 7:
				if (c1 == " "){
					c1 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 8:
				if (c2 == " "){
					c2 = "O";
				}
				else {
					enemyTurn();
				}
				break;
			case 9:
				if (c3 == " "){
					c3 = "O";
				}
				else {
					enemyTurn();
				}
				break;
		}
			System.out.println("     1     2     3  ");
			System.out.println("  -------------------");
			System.out.println("A |  " + a1 + "  |  " + a2 +"  |  "+ a3 +"  |");
			System.out.println("  -------------------");
			System.out.println("B |  " + b1 + "  |  " + b2 +"  |  "+ b3 +"  |");
			System.out.println("  -------------------");
			System.out.println("C |  " + c1 + "  |  " + c2 +"  |  "+ c3 +"  |");
			System.out.println("  -------------------");
			turn = 0;
			check();
		}
	}
	
