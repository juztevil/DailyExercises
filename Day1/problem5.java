import java.util.*;
class dept{
	String name;
	int marks_of_students[];
	dept(String str,int no_students){
		name=str;
		marks_of_students=new int[no_students];
	}
	String deptName(){
		return name;
	}
	void setMarks(String marks){
		int j=0;
		String ind_mark="";
		for(int i=0;i<marks.length();++i){
			if(marks.charAt(i)==','){
				marks_of_students[j++]=Integer.parseInt(ind_mark);
				ind_mark="";
			}
			else
			ind_mark+=marks.charAt(i);
		}
		marks_of_students[j]=Integer.parseInt(ind_mark);
	}
	int[] getTop3marks(){
		Arrays.sort(marks_of_students);
		int[] marks=new int[3];
		int j=0;
		for(int i=marks_of_students.length-1;i>=marks_of_students.length-3;--i)
		marks[marks_of_students.length-i-1]=marks_of_students[i];
		return marks;
	}
	int avg_withpassmarks(){
		int sum=0,count=0;
		for(int i=0;i<marks_of_students.length;++i){
			if(marks_of_students[i]>=50){
				sum+=marks_of_students[i];
				++count;
			}
		}
		return sum/count;
	}
	int fail_count(){
		int count=0;
		for(int i=0;i<marks_of_students.length;++i){
			if(marks_of_students[i]<50)
			++count;
		}
		return count;
	}
}
class problem5{
	public static void main(String args[]){
		dept cse = new dept("CSE",10);
		cse.setMarks("51,52,53,46,55,56,57,48,50,50");
		dept mech = new dept("MECH",12);
		mech.setMarks("61,42,33,47,65,66,17,68,69,70,71,22");
		dept ece = new dept("ECE",8);
		ece.setMarks("91,43,93,94,49,96,37,98");

		System.out.println("The top 3 marks in "+cse.deptName());
		int top3marks[]=cse.getTop3marks();
		for(int i=0;i<top3marks.length;++i)
		System.out.print(top3marks[i]+"  ");

		System.out.println("\nThe top 3 marks in "+mech.deptName());
		top3marks=mech.getTop3marks();
		for(int i=0;i<top3marks.length;++i)
		System.out.print(top3marks[i]+"  ");

		System.out.println("\nThe top 3 marks in "+ece.deptName());
		top3marks=ece.getTop3marks();
		for(int i=0;i<top3marks.length;++i)
		System.out.print(top3marks[i]+"  ");

		System.out.println("\n\nThe top 3 marks combined all "+cse.deptName()+"  "+mech.deptName()+"  "+ece.deptName());
		getTop3Markscombined(cse,mech,ece);

		System.out.println("\nAverage with passmarks in "+cse.deptName()+" : "+cse.avg_withpassmarks());
		System.out.println("Average with passmarks in "+mech.deptName()+" : "+mech.avg_withpassmarks());
		System.out.println("Average with passmarks in "+ece.deptName()+" : "+ece.avg_withpassmarks());

		System.out.print("\nAverage with passmarks in all classes "+cse.deptName()+"  "+mech.deptName()+"  "+ece.deptName()+" : ");
		System.out.println((cse.avg_withpassmarks()+mech.avg_withpassmarks()+ece.avg_withpassmarks())/3);

	System.out.print("\nThe class which has highest average is: ");
	find_highavgclass(cse,mech,ece);

	System.out.print("\nThe class with least failed students is: ");
	find_leastfailedstudents(cse,mech,ece);
	}
	public static void getTop3Markscombined(dept cseobj,dept mechobj,dept eceobj){
		int[] marks=new int[9];
		int[] a=cseobj.getTop3marks();
		for(int i=0;i<a.length;++i)
		marks[i]=a[i];
		a=mechobj.getTop3marks();
		for(int i=0;i<a.length;++i)
		marks[i+3]=a[i];
		a=eceobj.getTop3marks();
		for(int i=0;i<a.length;++i)
		marks[i+6]=a[i];
		Arrays.sort(marks);
		for(int i=marks.length-1;i>=marks.length-3;--i)
		System.out.println((marks.length-i)+" mark : "+marks[i]);
	}
	public static void find_highavgclass(dept cseobj,dept mechobj,dept eceobj){
		int avg1=cseobj.avg_withpassmarks();
		int avg2=mechobj.avg_withpassmarks();
		int avg3=eceobj.avg_withpassmarks();
		if(avg1>avg2 && avg1>avg3)
		System.out.print(cseobj.deptName()+" : "+avg1);
		if(avg2>avg1 && avg2>avg3)
		System.out.print(mechobj.deptName()+" : "+avg2);
		if(avg3>avg1 && avg3>avg2)
		System.out.print(eceobj.deptName()+" : "+avg3);		
	}
	public static void find_leastfailedstudents(dept cseobj,dept mechobj,dept eceobj){
		int class1=cseobj.fail_count();
		int class2=mechobj.fail_count();
		int class3=eceobj.fail_count();
		if(class1<class2 && class1<class3)
		System.out.println(cseobj.deptName()+" : "+class1);
		if(class2<class1 && class2<class3)
		System.out.println(mechobj.deptName()+" : "+class2);
		if(class3<class1 && class3<class2)
		System.out.println(eceobj.deptName()+" : "+class3);
	}
}













