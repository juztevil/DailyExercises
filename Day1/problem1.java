import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the end character: ");
		String str=scan.next(), oldstr="", newstr="";
		for(int i=97;i<=str.charAt(0);++i){
			oldstr=oldstr+(char)(i)+oldstr;
			System.out.println(oldstr);
			newstr=oldstr;
		}
	}
}


/*
Output :
apprenticeship>javac problem1.java

apprenticeship>java problem1
Enter the end character: g
a
aba
abacaba
abacabadabacaba
abacabadabacabaeabacabadabacaba
abacabadabacabaeabacabadabacabafabacabadabacabaeabacabadabacaba
abacabadabacabaeabacabadabacabafabacabadabacabaeabacabadabacabagabacabadabacabaeabacabadabacabafabacabadabacabaeabacabadabacaba

apprenticeship>

*/
