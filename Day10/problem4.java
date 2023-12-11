import java.util.*;
class problem4{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		ArrayList<String> li=new ArrayList<String>();
		ArrayList<Integer> stack=new ArrayList<Integer>();
		while(true){
			System.out.print("Enter the option: ");
			switch(scan.nextInt()){
				case 1:
					System.out.print("Enter the character: ");
					li.add(scan.next());
					System.out.println("The character added to the list.");
				break;
				case 2:
					int value=0;
					for(int i=0;i<li.size();++i){
						if(!(Character.isDigit(li.get(i).charAt(0)))){
							int n2=stack.get(stack.size()-1);
							stack.remove(stack.size()-1);
							int n1=stack.get(stack.size()-1);
							stack.remove(stack.size()-1);
							stack.add(perform(n1,n2,li.get(i).charAt(0)));
						}
						else
						stack.add(Integer.parseInt(li.get(i)));
					}
					System.out.println("The value is "+stack.get(0));
					stack.clear();
				break;
				case 3:
					System.out.println(li);
				break;
				case 4:
					System.out.println("Bye!:)");
					System.exit(0);
			}
		}
	}
	public static int perform(int num1,int num2,char symbol){
		int ans=0;
		switch(symbol){
			case '+'	->	ans=num1+num2;
			case '-'	->	ans=num1-num2;
			case '*'	->	ans=num1*num2;
			case '/'	->	ans=num1/num2;
			case '%'	->	ans=num1%num2;
		}
		return ans;
	}
}


/*

Output:
apprenticeship>java problem4
Enter the option: 1
Enter the character: 10
The character added to the list.
Enter the option: 1
Enter the character: 2
The character added to the list.
Enter the option: 1
Enter the character: 3
The character added to the list.
Enter the option: 1
Enter the character: +
The character added to the list.
Enter the option: 1
Enter the character: -
The character added to the list.
Enter the option: 1
Enter the character: 5
The character added to the list.
Enter the option: 1
Enter the character: *
The character added to the list.
Enter the option: 3
[10, 2, 3, +, -, 5, *]
Enter the option: 2
The value is 25
Enter the option: 3
[10, 2, 3, +, -, 5, *]
Enter the option: 4
Bye!:)

apprenticeship>

*/