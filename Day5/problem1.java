import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		char[][] theater=new char[11][11];
		for(int i=0;i<theater.length;++i){
			for(int j=0;j<theater[i].length;++j)
			theater[i][j]='*';
		}
		System.out.println("Theater Reservation:\n1) Reserve seats\n2) Check seats\n3) Exit");
		while(true){
			System.out.print("Enter the option: ");
			int option=scan.nextInt();
			switch(option){
				case 1:
					System.out.println("There are "+(char)(65)+" to "+(char)(theater.length-1+65)+" rows and each row contains "+theater[0].length+" seats.");
					System.out.println("You can reserve a seat or more seats at a time:");
					System.out.println("To book multiple seats use comma to seperate the seats.");
					System.out.println("for example: F09, A01");
					System.out.print("Enter the seat(s): ");
					String seat=scan.next(),substr="";
					for(int i=0;i<seat.length();++i){
						if(seat.charAt(i)==','){
							int row=substr.charAt(0)-64;
							int column=substr.charAt(2)-48;
							if(!Character.isLetter(theater[row-1][column-1])){
								theater[row-1][column-1]='R';
								System.out.println(substr+" seat successfully reserved.");
							}
							else
							System.out.println(substr+" is already reserved.");
							substr="";
						}
						else
						substr+=seat.charAt(i);
					}
					int row=substr.charAt(0)-64;
					int column=substr.charAt(2)-48;
					if(!Character.isLetter(theater[row-1][column-1])){
						theater[row-1][column-1]='R';
						System.out.println(substr+" seat successfully reserved.");
					}
					else
					System.out.println(substr+" is already reserved.");
				break;
				case 2:
					printTheater(theater);
				break;
				case 3:
					System.out.println("ThankYou Enjoy the Movie! :)");
					System.exit(0);
			}
		}
	}
	public static void printTheater(char[][] seats){
		printscreen();
		System.out.println("+=========================================+");
		for(int i=0;i<seats.length;++i){
			System.out.print("|  ");
			for(int j=0;j<seats[i].length;++j){
				if(j==3 || j==8)
				System.out.print("|  ");
				System.out.print(seats[i][j]+"  ");
			}
			System.out.println("|");
		}
		System.out.println("+=========================================+");
	}
	public static void printscreen(){
		System.out.println("            ++++++++++++++++++");
		for(int i=0;i<4;++i){
			System.out.print("            |");
			for(int j=0;j<16;++j)
			System.out.print("*");
			System.out.println("|");
		}
		System.out.println("            ++++++++++++++++++");
	}
}


/*
Output
apprenticeship>javac problem1.java

apprenticeship>java problem1
Theater Reservation:
1) Reserve seats
2) Check seats
3) Exit
Enter the option: 1
There are A to K rows and each row contains 11 seats.
You can reserve a seat or more seats at a time:
To book multiple seats use comma to seperate the seats.
for example: F09, A01
Enter the seat(s): A01
A01 seat successfully reserved.
Enter the option: 2
            ++++++++++++++++++
            |****************|
            |****************|
            |****************|
            |****************|
            ++++++++++++++++++
+=========================================+
|  R  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
+=========================================+
Enter the option: 1
There are A to K rows and each row contains 11 seats.
You can reserve a seat or more seats at a time:
To book multiple seats use comma to seperate the seats.
for example: F09, A01
Enter the seat(s): A02,A03,A04
A02 seat successfully reserved.
A03 seat successfully reserved.
A04 seat successfully reserved.
Enter the option: 2
            ++++++++++++++++++
            |****************|
            |****************|
            |****************|
            |****************|
            ++++++++++++++++++
+=========================================+
|  R  R  R  |  R  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
|  *  *  *  |  *  *  *  *  *  |  *  *  *  |
+=========================================+
Enter the option: 1
There are A to K rows and each row contains 11 seats.
You can reserve a seat or more seats at a time:
To book multiple seats use comma to seperate the seats.
for example: F09, A01
Enter the seat(s): A01
A01 is already reserved.
Enter the option: 3
ThankYou Enjoy the Movie! :)

apprenticeship>
*/
