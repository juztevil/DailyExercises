import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<String> display=new ArrayList<String>();
		while(true){
			System.out.print("Enter the option: ");
			switch(scan.nextInt()){
				case 1:
					System.out.print("Enter the element: ");
					li.add(scan.nextInt());
					System.out.println("The element added successfully");
				break;
				case 2:
					int duplicate=0;
					display.add(li.get(0).toString());
					for(int i=1;i<li.size();++i){
						int flag=0;
						if(li.get(i)==li.get(i-1)){
							flag=1;
							++duplicate;
						}
						if(flag==1)
						display.add("_");
						else{
							if(duplicate>=1)
							display.add(display.size()-duplicate,li.get(i).toString());
							else
							display.add(li.get(i).toString());
						}						
					}
					System.out.println(display);
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
}

/*

Output:
apprenticeship>javac problem1.java

apprenticeship>java problem1
Enter the option: 1
Enter the element: 1
The element added successfully
Enter the option: 1
Enter the element: 2
The element added successfully
Enter the option: 1
Enter the element: 3
The element added successfully
Enter the option: 1
Enter the element: 3
The element added successfully
Enter the option: 13
Enter the option: 1
Enter the element: 3
The element added successfully
Enter the option: 1
Enter the element: 4
The element added successfully
Enter the option: 1
Enter the element: 4
The element added successfully
Enter the option: 1
Enter the element: 7
The element added successfully
Enter the option: 1
Enter the element: 7
The element added successfully
Enter the option: 1
Enter the element: 9
The element added successfully
Enter the option: 3
[1, 2, 3, 3, 3, 4, 4, 7, 7, 9]
Enter the option: 2
[1, 2, 3, 4, 7, 9, _, _, _, _]
Enter the option: 4
Bye!:)

apprenticeship>

*/









