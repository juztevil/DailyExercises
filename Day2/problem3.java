/*
Single player dice game.
i)   initialize the point to 0
ii)  this program uses rand() of Random class to generate the number for dice roll
iii) the match ends if either player gets 50+ points or player gets 0 in dice roll
*/

import java.util.*;
class problem3{
	public static void main(String args[]){
		Random rand=new Random();
		int player_point=0;
		while(player_point<50){
			System.out.println("Rolling the dice......");
			int dice_output=rand.nextInt(7);
			switch(dice_output){
				case 0:
					System.out.println("The dice rolled in "+dice_output+". : Quitting the game");
					System.out.println("Total point is: "+player_point);
					System.exit(0);	
				break;
				case 2,4,6:
					System.out.println("The dice rolled in "+dice_output+". : +2 points");
					player_point+=2;
				break;
				case 1,3:
					System.out.println("The dice rolled in "+dice_output+". : played jumped");
				break;
				case 5:
					System.out.println("The dice rolled in "+dice_output+". : +3 points");
					player_point+=3;
				break;
			}
		}
		System.out.println("The moatch is over. The player get "+player_point+" points.");
	}
}

/*

Output:
apprenticeship>java problem3
Rolling the dice......
The dice rolled in 0. : Quitting the game
Total point is: 0

apprenticeship>java problem3
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 1. : played jumped
Rolling the dice......
The dice rolled in 0. : Quitting the game
Total point is: 6

apprenticeship>java problem3
Rolling the dice......
The dice rolled in 1. : played jumped
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 1. : played jumped
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 1. : played jumped
Rolling the dice......
The dice rolled in 5. : +3 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 1. : played jumped
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 6. : +2 points
Rolling the dice......
The dice rolled in 0. : Quitting the game
Total point is: 15

apprenticeship>java problem3
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 0. : Quitting the game
Total point is: 2

apprenticeship>java problem3
Rolling the dice......
The dice rolled in 5. : +3 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 4. : +2 points
Rolling the dice......
The dice rolled in 1. : played jumped
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 6. : +2 points
Rolling the dice......
The dice rolled in 6. : +2 points
Rolling the dice......
The dice rolled in 6. : +2 points
Rolling the dice......
The dice rolled in 3. : played jumped
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 2. : +2 points
Rolling the dice......
The dice rolled in 0. : Quitting the game
Total point is: 23

apprenticeship>

*/