import java.util.*;
class problem2{
	public static void main(String args[]){
		int failcount=0;
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<10;++i)
		names.add((char)(97+i)+"");
		ArrayList<Integer> marks = new ArrayList<Integer>();
		for(int i=46;i<names.size()+46;++i)
		marks.add(i);
		ArrayList<String> passedStudents = new ArrayList<String>();
		for(int i=0;i<names.size();++i){
			if(marks.get(i)>=50)
			passedStudents.add(names.get(i)+" : "+convertmetostring(marks.get(i)));
			else
			++failcount;
		}
		System.out.println("Students and their marks:");
		for(int i=0;i<marks.size();++i)
		System.out.println(names.get(i)+" : "+marks.get(i));
		System.out.println("Students who passed in the exam:");
		for(int i=0;i<passedStudents.size();++i)
		System.out.println(passedStudents.get(i));
		System.out.println("Number of students failed in the exam: "+failcount);
	}
	public static String convertmetostring(int mark){
		String number="";
		while(mark!=0){
			number=((char)(mark%10+48)+"")+number;
			mark/=10;
		}
		return number;
	}
}

/*
Output:
apprenticeship>java problem2
Students and their marks:
a : 46
b : 47
c : 48
d : 49
e : 50
f : 51
g : 52
h : 53
i : 54
j : 55
Students who passed in the exam:
e : 50
f : 51
g : 52
h : 53
i : 54
j : 55
Number of students failed in the exam: 4

apprenticeship>
*/