/*
	A number is palindrome if it satisfy both conditions below:
		1) it should be palindrome
		2) the square of the number should be palindrome
	ex)
	121	1)it is palindrome
		2)the square of 121 is 14641, which is a palindrome.   	so print this
	
	131	1)it is palindrome
		2)the square of 131 is 17161, which is not a palindrome.   so don't print this
*/

import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the string(comma seperated valuse): ");
		String input=scan.next(), number="";						//geting input
		for(int i=0;i<input.length();++i){
			if(input.charAt(i)==','){						//seperating it by ','
				if(amIPalindrome(number)){					//initial condition
					if(amIPalindrome(multiple(number)))			//second condition
					System.out.print(number+"  ");
				}
				number="";
			}
			else
			number+=input.charAt(i);
		}
		if(amIPalindrome(number)){
			if(amIPalindrome(multiple(number)))
			System.out.print(number+"  ");
		}
	}
	public static boolean amIPalindrome(String str){					//same function for both conditions
		for(int i=0;i<str.length();++i){
			if(i>str.length()-i-1)
			break;
			if(!(str.charAt(i)+"").equals(str.charAt(str.length()-i-1)+""))
			return false;
		}
		return true;
	}
	public static String multiple(String num){						//if condition one passes we have to
		return Integer.toString((Integer.parseInt(num))*(Integer.parseInt(num)));	//multiple and send it the same function
	}											//so multiplying the number
}

/*

apprenticeship>javac problem1.java

apprenticeship>java problem1
Enter the string(comma seperated valuse): 121,131
121
apprenticeship>java problem1
Enter the string(comma seperated valuse): 121,131,134,121
121  121
apprenticeship>

*/
