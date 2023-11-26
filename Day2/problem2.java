//counting consecutive words in the passage

import java.util.*;
class problem2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a passage: ");
		int consecutive_count=0;
		String passage=scan.nextLine(),substr="";
		for(int i=0;i<passage.length();++i){
			if(passage.charAt(i)==' '){
				String consecutive="";
				for(int j=i+1;j<passage.length();++j){
					if(passage.charAt(j)==' ')
					break;
					consecutive+=passage.charAt(j);
				}
				if(substr.equals(consecutive))
				++consecutive_count;
				consecutive=substr="";
			}
			else
			substr+=passage.charAt(i);
		}
		System.out.println("The consecutive words count :"+consecutive_count);
	}
}

/*

Output:
apprenticeship>javac problem2.java

apprenticeship>java problem2
Enter a passage: apple apple
The consecutive words count :1

apprenticeship>java problem2
Enter a passage: apple orange apple
The consecutive words count :0

apprenticeship>java problem2
Enter a passage: apple orange orange is not not a a
The consecutive words count :3

apprenticeship>

*/