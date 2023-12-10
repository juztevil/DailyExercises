import java.util.*;
class problem3{
	public static void main(String args[]){
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("1)Enter the element for List1\n2)Enter the element for List2\n3)Perform the opertion\n4)Exit");
		while(true){
			System.out.print("\nEnter the option: ");
			switch(scan.nextInt()){
				case 1:
					System.out.println("Enter the element: ");
					list1.add(scan.nextInt());
					System.out.println("Element added to the List1.");
				break;
				case 2:
					System.out.println("Enter the element: ");
					list2.add(scan.nextInt());
					System.out.println("Element added to the List2.");
				break;
				case 3:
					System.out.println("The first list is : "+list1);
					System.out.println("The second list is : "+list2);
					System.out.println("The result list is: "+result(list1,list2));
				break;
				case 4:
					System.out.println("Bye! :)");
					System.exit(0);
			}
		}
	}
	public static ArrayList<Integer> result(ArrayList<Integer> l1,ArrayList<Integer> l2){
		int reversed=makemenumberandreverse(l1)+makemenumberandreverse(l2);
		ArrayList<Integer> rev=new ArrayList<Integer>();
		while(reversed!=0){
			rev.add(reversed%10);
			reversed/=10;
		}
		return rev;
	}
	public static int makemenumberandreverse(ArrayList<Integer> list){
		int num=0;
		for(int i=list.size()-1;i>=0;--i)
		num = (num*10) + list.get(i);
		return num;
	}
}
