import java.util.*;
class problem3{
	public static void main(String args[]){
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<10;++i)
		names.add((char)(97+i)+"");
		List<ArrayList<Integer>> marks = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<names.size();++i){
			ArrayList<Integer> seperateMarks = new ArrayList<Integer>();
			for(int j=0;j<3;++j)
			seperateMarks.add(i+j+87);
			marks.add(seperateMarks);
		}
		System.out.println("Students and their marks:\nName  CS    Math  English");
		for(int i=0;i<marks.size();++i){
			System.out.print(names.get(i)+"  :  ");
			for(int j=0;j<marks.get(i).size();++j)
			System.out.print(marks.get(i).get(j)+"    ");
			System.out.println();
		}
		System.out.println("Students who got A in all subjects or A in one and rest of all is B:");
		for(int i=0;i<names.size();++i){
			if(amIfullgradeA(marks.get(i)) || amI1AandrestB(marks.get(i)))
			System.out.println(names.get(i));
		}
	}
	public static boolean amIfullgradeA(ArrayList<Integer> li){
		for(int i=0;i<li.size();++i){
			if(li.get(i)<90)
			return false;
		}
		return true;
	}
	public static boolean amI1AandrestB(ArrayList<Integer> li){
		int acount=0, bcount=0;
		for(int i=0;i<li.size();++i){
			if(li.get(i)>=90)
			++acount;
			else if(li.get(i)>=80)
			++bcount;
		}
		if(acount>=1)
		return true;
		return false;
	}
}

/*
 Output : I have changed the values check with inputs

apprenticeship>javac problem3.java

apprenticeship>java problem3
Students and their marks:
Name  CS    Math  English
a  :  88    89    90
b  :  89    90    91
c  :  90    91    92
d  :  91    92    93
e  :  92    93    94
f  :  93    94    95
g  :  94    95    96
h  :  95    96    97
i  :  96    97    98
j  :  97    98    99
Students who got A in all subjects or A in one and rest of all is B:
a
b
c
d
e
f
g
h
i
j

apprenticeship>javac problem3.java

apprenticeship>java problem3
Students and their marks:
Name  CS    Math  English
a  :  87    88    89
b  :  88    89    90
c  :  89    90    91
d  :  90    91    92
e  :  91    92    93
f  :  92    93    94
g  :  93    94    95
h  :  94    95    96
i  :  95    96    97
j  :  96    97    98
Students who got A in all subjects or A in one and rest of all is B:
b
c
d
e
f
g
h
i
j

apprenticeship>
*/