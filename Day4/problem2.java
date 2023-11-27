import java.util.*;
class problem2{
	public static void main(String args[]){
		char[][] board = new char[6][6];
		for(int i=0;i<board.length;++i){								//initializing board with '*'
			for(int j=0;j<board[i].length;++j)
				board[i][j]='*';
		}
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("Enter the first player name: ");
		String player_one=scan.nextLine();
		System.out.print("Enter the second player name: ");
		String player_two=scan.nextLine();
		int player_one_point=0, player_two_point=0, i=0;
		System.out.println("Player one starts the game.");
		while(player_one_point<5 && player_two_point<5){
			draw_the_board(board,player_one,player_one_point,player_two,player_two_point);
			int dice_roll_1=rand.nextInt(1,7);							//using "random" class to genearte the dice number
			int dice_roll_2=rand.nextInt(1,7);
			if(i%2==0){
				System.out.println(player_one+" rollong the dices........");
				if(Character.isLetter(board[dice_roll_1-1][dice_roll_2-1])){
					++player_one_point;
					board[dice_roll_1-1][dice_roll_2-1]=player_one.charAt(0);
				}
				else
				board[dice_roll_1-1][dice_roll_2-1]=player_one.charAt(0);
			}
			else{
				System.out.println(player_two+" rolling the dices........");
				if(Character.isLetter(board[dice_roll_1-1][dice_roll_2-1])){
					++player_two_point;
					board[dice_roll_1-1][dice_roll_2-1]=player_two.charAt(0);
				}
				else
				board[dice_roll_1-1][dice_roll_2-1]=player_two.charAt(0);
			}
			++i;
		}
		draw_the_board(board,player_one,player_one_point,player_two,player_two_point);
	}
	public static void draw_the_board(char[][] arr,String p1,int p1point,String p2,int p2point){		//this method is for printing the board
		System.out.println("Score table: ");
		System.out.println(p1+"  :  "+p1point+"  "+p2+"  :  "+p2point);
		System.out.println("Board:");
		for(int i=0;i<arr.length;++i){
			for(int j=0;j<arr[i].length;++j)
			System.out.print(arr[i][j]+"  ");
			System.out.println();
		}
	}
}


/*

Output:
apprenticeship>javac problem2.java

apprenticeship>java problem2
Enter the first player name: Human
Enter the second player name: Robot
Player one starts the game.
Score table:
Human  :  0  Robot  :  0
Board:
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
Human rollong the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
Robot rolling the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  R  *
*  *  *  *  *  *
Human rollong the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  *  *  *  *
*  *  *  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  *  *  *  *
R  *  *  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  *  *  *  *
R  *  H  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  0  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  *  *  *  R
R  *  H  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  1  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  *  *  *  R
H  *  H  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  1  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  R  *  *  R
H  *  H  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  2  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  R  *  *  R
H  *  H  *  H  *
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  2  Robot  :  0
Board:
*  *  H  *  *  *
*  *  R  *  *  *
*  *  R  *  *  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
*  *  H  *  *  *
*  *  R  *  *  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  *  H  *  *  *
*  *  R  *  *  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  *  H  *  *  *
*  *  R  *  H  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  *  H  *  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  *  *
Human rollong the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  *  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  *  *
Robot rolling the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  *  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  *  *  *  R  *
*  *  H  *  R  *
Human rollong the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  *  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  *  *  *  R  *
H  *  H  *  R  *
Robot rolling the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  R  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  *  *  *  R  *
H  *  H  *  R  *
Human rollong the dices........
Score table:
Human  :  3  Robot  :  0
Board:
*  *  H  *  *  *
R  R  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  H  *  *  R  *
H  *  H  *  R  *
Robot rolling the dices........
Score table:
Human  :  3  Robot  :  1
Board:
*  *  H  *  *  *
R  R  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  H  *  *  R  *
H  *  H  *  R  *
Human rollong the dices........
Score table:
Human  :  4  Robot  :  1
Board:
*  *  H  *  *  *
R  R  H  H  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  H  *  *  R  *
H  *  H  *  H  *
Robot rolling the dices........
Score table:
Human  :  4  Robot  :  2
Board:
*  *  H  *  *  *
R  R  H  R  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  H  *  *  R  *
H  *  H  *  H  *
Human rollong the dices........
Score table:
Human  :  5  Robot  :  2
Board:
*  *  H  *  *  *
R  R  H  R  *  R
*  *  R  *  H  R
H  *  H  *  H  R
*  H  *  *  R  *
H  *  H  *  H  *

apprenticeship>

/*