//pascal triangle 

import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n=scan.nextInt();
		ArrayList<Integer> li=new ArrayList<Integer>();				//for dynamic storing
		li.add(1);
		for(int i=0;i<n;++i){
 			for(int k=n-i;k>1;--k)						//for printing the elements in the list
			System.out.print(" ");
			for(int j=0;j<li.size();++j)
			System.out.print(li.get(j)+" ");
			if(i==n-1)
			continue;
			li=createthepascalrow(li);					//this function will return a new list
			System.out.println();
		}
	}
	public static ArrayList<Integer> createthepascalrow(ArrayList<Integer> l){	//we may modify the existing list but
		ArrayList<Integer> pascalrow=new ArrayList<Integer>();			//modify results in changes in the
		pascalrow.add(1);							//existing array itself
		for(int i=1;i<l.size();++i)						//so we created a new list and using
		pascalrow.add(l.get(i)+l.get(i-1));					//passed list elements 
		pascalrow.add(1);							//we added elements to the created list
		return pascalrow;
	}
}