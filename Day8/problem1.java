import java.util.*;
class problem{
	public static void main(String args[]){
		int price=0, no_seats=0;
		System.out.println("1)check profit for first class\n2)check profit for second class\n3)check profit for third class\n4)exit");
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("\nEnter the option: ");
			switch(scan.nextInt()){
			case 1:
				System.out.print("Enter the price of a ticket: ");
				price=scan.nextInt();
				System.out.print("Enter the number of tickets sold: ");
				no_seats=scan.nextInt();
				System.out.println("The profit percentage per ticket is 25%");
				System.out.println("Total profit percentage: "+findpercentage(no_seats,25));
				System.out.println("Additional profit for solding a first class ticket is 100");
				System.out.println("Total additional profit: "+additionalprofit(no_seats,100));
				System.out.println("Total money generated in profit in solding first class tickets:"+((no_seats*100)+findprofitinpercentage((no_seats*25),(price))));
			break;
			case 2:
				System.out.print("Enter the price of a ticket: ");
				price=scan.nextInt();
				System.out.print("Enter the number of tickets sold: ");
				no_seats=scan.nextInt();
				System.out.println("The profit percentage per ticket is 15%");
				System.out.println("Total profit percentage: "+findpercentage(no_seats,15));
				System.out.println("Additional profit for solding a second class ticket is 70");
				System.out.println("Total additional profit: "+additionalprofit(no_seats,70));
				System.out.println("Total money generated in profit in solding second class tickets:"+((no_seats*70)+findprofitinpercentage((no_seats*15),(price))));
			break;
			case 3:
				System.out.print("Enter the price of a ticket: ");
				price=scan.nextInt();
				System.out.print("Enter the number of tickets sold: ");
				no_seats=scan.nextInt();
				System.out.println("The profit percentage per ticket is 5%");
				System.out.println("Total profit percentage: "+findpercentage(no_seats,5));
				System.out.println("Total money generated in profit in solding third class tickets:"+((no_seats*70)+findprofitinpercentage((no_seats*15),1)));
			break;
			case 4:
				System.out.println("Bye !:)");
				System.exit(0);
			}
		}
	}
	public static int findprofitinpercentage(int percent, int price){
		return (percent/100)*price;
	}
	public static int findpercentage(int seats,int rate){
		return seats*rate;
	}
	public static int additionalprofit(int seats,int rate){
		return seats*rate;
	}
}

/*

output:
apprenticeship>javac problem1.java

apprenticeship>java problem
1)check profit for first class
2)check profit for second class
3)check profit for third class
4)exit

Enter the option: 1
Enter the price of a ticket: 100
Enter the number of tickets sold: 4
The profit percentage per ticket is 25%
Total profit percentage: 100
Additional profit for solding a first class ticket is 100
Total additional profit: 400
Total money generated in profit in solding first class tickets:500

Enter the option: 2
Enter the price of a ticket: 80
Enter the number of tickets sold: 15
The profit percentage per ticket is 15%
Total profit percentage: 225
Additional profit for solding a second class ticket is 70
Total additional profit: 1050
Total money generated in profit in solding second class tickets:1210

Enter the option: 3
Enter the price of a ticket: 40
Enter the number of tickets sold: 30
The profit percentage per ticket is 5%
Total profit percentage: 150
Total money generated in profit in solding third class tickets:2104

Enter the option: 4
Bye !:)

apprenticeship>

*/
