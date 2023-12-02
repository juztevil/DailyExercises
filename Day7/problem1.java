import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a phrase or word(that contains atlesast two 'A'): ");
		String word=scan.nextLine();
		System.out.println("The letters between front A and back A: ");
		for(int i=find('A',word,1)+1;i<find('A',word,-1);++i)
		System.out.print(word.charAt(i));
	}
	public static int find(char ch,String s,int wards){			//same function for finding the letters 
		if(wards==1){							                            //wards is a integer and it is used 
			for(int i=0;i<s.length();++i){				              //to differeniate frontwards and backwards
				if(s.charAt(i)==ch)  
				return i;
			}
		}
		else{
			for(int i=s.length()-1;i>=0;--i){
				if(s.charAt(i)==ch)
				return i;
			}
		}
		return 0;
	}
}

/*
apprenticeship>javac problem1.java

apprenticeship>java problem1
Enter a phrase or word(that contains atlesast two 'A'):
FghyAhbdhAndjjAiuy
The letters between front A and back A:
hbdhAndjj
apprenticeship>java problem1
Enter a phrase or word(that contains atlesast two 'A'):
jfhdjAAkio
The letters between front A and back A:

apprenticeship>java problem1
Enter a phrase or word(that contains atlesast two 'A'):
Ajdjd
The letters between front A and back A:

apprenticeship>java problem1
Enter a phrase or word(that contains atlesast two 'A'):
AjdudjA
The letters between front A and back A:
jdudj
apprenticeship>
*/
