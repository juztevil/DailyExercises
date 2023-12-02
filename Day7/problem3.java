/*

from question i have understood that
					exact pair 	otherwise
we have find a exact pair otherwise  	A, A		A, 0
go for character's before one		B, B		B,A B,0
					C, C		C,B c,A C,0
					D, D		D,C D,B D,A D,0
					and so on.....
*/

import java.util.*;
class problem3{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word a phrase: ");
		String str=scan.nextLine();
		for(int i=65;i<=90;++i){
			if(!str.contains((char)(i)+""))
			continue;
			for(int j=i;j>=65;--j){
				if(str.substring(str.indexOf((char)(i))+1).contains((char)(j)+"")){
					System.out.println("We have found first "+(char)(i)+" and last "+(char)(j));
					System.out.println("And the letters between them is: ");
					for(int k=str.indexOf((char)(i))+1;k<=str.substring(str.indexOf(i)+1).indexOf((char)(j));++k)
					System.out.print(str.charAt(k));
					break;
				}
			}
		}
	}
}

/*

Output
apprenticeship>javac problem3.java

apprenticeship>java problem3
Enter the word a phrase:
AbhuhA
We have found first A and last A
And the letters between them is:
bhuh
apprenticeship>java problem3
Enter the word a phrase:
BghiBandA
We have found first B and last B
And the letters between them is:
ghi
apprenticeship>java problem3
Enter the word a phrase:
BhiC

apprenticeship>java problem3
Enter the word a phrase:
ZyudgdbdhG
We have found first Z and last G
And the letters between them is:
yudgdbdh
apprenticeship>

*/