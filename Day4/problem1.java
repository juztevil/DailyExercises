import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a passage: ");
		String str=scan.nextLine(), substr="";
		System.out.println("Reversing the each word in the passage:");
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)==' '){
				System.out.print(reverseme(substr)+" ");
				substr="";
			}
			else
			substr+=str.charAt(i);
		}
		System.out.println(reverseme(substr));
	}
	public static String reverseme(String s){
		String reversed="";
		for(int i=s.length()-1;i>=0;--i)
		reversed+=s.charAt(i);
		return reversed;
	}
}


/*
Output
apprenticeship>javac problem1.java

apprenticeship>java problem1
Enter a passage: I am Sayur
Reversing the each word in the passage:
I ma ruyaS

apprenticeship>java problem1
Enter a passage: My Name is Human being
Reversing the each word in the passage:
yM emaN si namuH gnieb

apprenticeship>
*/
