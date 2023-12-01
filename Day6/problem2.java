/*
[1,2]   -- 1,2,3
[2,6]	--2,3,4,5,6                                            temp = [[1,6],[8,10],[15,20],[16,25]]  --> it have a continuity
[8,10]  -- 8,9,10				                               again temp =[[1,6],[8,10],[15,25]]	          --> it has no continuity
[15,20] --15,16,17,18,19,20
[16,25] --16,17,18,19,20,21,22,23,24,25


[[1,6],[8,10],[15,25]]
*/

import java.util.*;
class problem2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> intervals = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> temp;
		ArrayList<Integer> interval;
		System.out.println("Operations\n1)add a interval\n2)print overlapping intervals\n3)Print the List\n4)exit");
		while(true){													                                                                          //while loop to get elements seamlessly
			System.out.print("\nEnter a option: ");
			switch(scan.nextInt()){											                                                                  //switch is for options
				case 1:												                                                                              //case 1: is for entering the normal list
					System.out.print("Add an Start range: ");						                                                      //and add it to the 2dlist
					interval=new ArrayList<Integer>();
					interval.add(scan.nextInt());
					System.out.print("Add an End range: ");
					interval.add(scan.nextInt());
					intervals.add(interval);
					System.out.println("Interval added successfully");
				break;
				case 2:											                                                                              	//case 2: is for checking the overlapping 
					temp = new ArrayList<ArrayList<Integer>>();						                                                    //intervals
					for(int i=1;i<intervals.size();++i){							                                                        //I approached it in 2ways
						if(intervals.get(i-1).get(1)>=intervals.get(i).get(0)){			                                          	//i) is to create a temp(2d list)
							interval=new ArrayList<Integer>();					                                                          //because assigning original(intervals) to
							interval.add(intervals.get(i-1).get(0));			                                                      	//some other and any changes to new one  
							interval.add(intervals.get(i).get(1));					                                                      //will affect also the original one
							temp.add(interval);							                                                                      //instead create a new one and modify it
						}
						else
						temp.add(intervals.get(i));
					}
					while(amIhavecontinuity(temp)){							                                                             	//ii) endlessly check for if there(in temp)
						for(int i=1;i<temp.size();++i){						                                                            	//any overlapping(below method) and modify
							if(temp.get(i-1).get(1)>=temp.get(i).get(0)){				                                                  //the temp one
								temp.get(i-1).set(1,temp.get(i).get(1));
								temp.remove(i);
							}
						}
					}
					System.out.println("The overlapping elements are: ");
					printthe2dlist(temp);								                                                                    	//finally print the temp one
					temp.clear();
				break;
				case 3:												                                                                              //case 3: it is for printing the original 2dlist
					System.out.println("The List Elements are: ");
					printthe2dlist(intervals);
				break;
				case 4:											                                                                               	//case 4: it is for quitting the while loop
					System.out.println("Bye!");
					System.exit(0);
			}			
		}
	}
	public static boolean amIhavecontinuity(ArrayList<ArrayList<Integer>> li){			                                	//this method is for check is there is
		for(int i=1;i<li.size();++i){									//any overlapping in the 2dlist
			if(li.get(i-1).get(1)>=li.get(i).get(0))						//accepts 2dlist
			return true;										//return a boolean (ie) if continuity return true
		}												//else false
		return false;
	}
	public static void printthe2dlist(ArrayList<ArrayList<Integer>> li){					                                    //the common task is printing the 2dlist
		System.out.print("[");										                                                                      //so I used a method that accepts a 2dlist
		for(int i=0;i<li.size();++i){									                                                                  //parameter and then print in in [[1,1],[1,1],[1,1]] format
			System.out.print("[");
			for(int j=0;j<li.get(i).size();++j){
				System.out.print(li.get(i).get(j));
				if(j==li.get(i).size()-1)
				continue;
				System.out.print(",");
			}
			if(i==li.size()-1)
			System.out.print("]");
			else
			System.out.print("],");
		}
		System.out.println("]");
	}
}


/*

Output:
apprenticeship>javac problem2.java

apprenticeship>java problem2
Operations
1)add a interval
2)print overlapping intervals
3)Print the List
4)exit

Enter a option: 1
Add an Start range: 1
Add an End range: 2
Interval added successfully

Enter a option: 1
Add an Start range: 2
Add an End range: 6
Interval added successfully

Enter a option: 1
Add an Start range: 8
Add an End range: 10
Interval added successfully

Enter a option: 1
Add an Start range: 15
Add an End range: 20
Interval added successfully

Enter a option: 1
Add an Start range: 16
Add an End range: 25
Interval added successfully

Enter a option: 3
The List Elements are:
[[1,2],[2,6],[8,10],[15,20],[16,25]]

Enter a option: 2
The overlapping elements are:
[[1,6],[8,10],[15,25]]

Enter a option: 3
The List Elements are:
[[1,2],[2,6],[8,10],[15,25],[16,25]]

Enter a option: 4
Bye!

apprenticeship>

*/
