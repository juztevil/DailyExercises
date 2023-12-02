import java.util.*;
class problem2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a word or a phrase: ");
		String str=scan.nextLine();
		for(int i=65;i<=90;++i){
			if(!amIhavemore((char)(i),str))										//this method is to check if there
			continue;												//is any two charactes in the word 
			System.out.println("We found two "+(char)(i)+" in the given string.\nThe letters between them is:");
			for(int j=find((char)(i),str,1)+1;j<find((char)(i),str,-1);++j)						//finding the first and last index of 
			System.out.print(str.charAt(j));									//founded character and printing in between 
			break;													//characters
		}		
	}
	public static boolean amIhavemore(char ch,String s){
		int count=0;
		for(int i=0;i<s.length();++i){
			if(s.charAt(i)==ch)
			++count;
			if(count==2)
			return true;
		}
		return false;
	}
	public static int find(char ch,String s,int wards){							//same function for finding the letters
		if(wards==1){											//wards is a integer and it is used 
			for(int i=0;i<s.length();++i){								//to differeniate frontwards and backwards
				if(s.charAt(i)==ch)
				return i;
			}
		}
		else{
			for(int j=s.length()-1;j>=0;--j){
				if(s.charAt(j)==ch)
				return j;
			}
		}
		return 0;
	}
}

/*
 output
apprenticeship>javac problem2.java

apprenticeship>java problem2
Enter a word or a phrase: ABCCDFGHUD
We found two C in the given string.
The letters between them is:

apprenticeship>java problem2
Enter a word or a phrase: abcDefghiD
We found two D in the given string.
The letters between them is:
efghi
apprenticeship>
*/