import java.util.*;
class problem1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		ArrayList<String> li=new ArrayList<String>(Arrays.asList("we","doctors","are","nurses","and"));		//the list
		System.out.println(trueorfalse("wearenursesanddoctors",li));						//function which performs the action
	}
	public static boolean trueorfalse(String input,ArrayList<String> l){						//this function returns three values
		System.out.println("The List is: "+l+" the input is: "+input);						//1)I am there
		String checkstr="";											//to indicate we found a right match
		for(int i=0;i<input.length();++i){	
			checkstr+=input.charAt(i);									//2)I am not there but wait
			String result=amIinList(checkstr,l);								//to indicate a found was made 
			if(result.equals("Iamthere")){									//but not the fully string
				System.out.println(checkstr);
				checkstr="";
			}
			else if(result.equals("Iamnottherebutwait")){
				System.out.println(checkstr);								//3)I am not there
				continue;										//to indicate no match found
			}
			else{
				System.out.println(checkstr);
				return false;
			}
		}
		if(checkstr.length()==0)										//this to ensure that someparts 
		return true;												//may match and return I am not there but 
		return false;												//wait, this may remain in our code
	}														//and finally return true to our main
	public static String amIinList(String str,ArrayList<String> li){
		for(int i=0;i<li.size();++i){
			if(str.equals(li.get(i)))
			return "Iamthere";
		}
		for(int i=0;i<li.size();++i){
			if(li.get(i).contains(str))
			return "Iamnottherebutwait";
		}
		return "Iamnotthere";		
	}
}

/*

Output:
apprenticeship>javac problem1.java

apprenticeship>java problem1
The List is: [we, students, are] the input is: wearestudent
w
we
a
ar
are
s
st
stu
stud
stude
studen
student
false

apprenticeship>javac problem1.java

apprenticeship>java problem1
The List is: [we, students, are] the input is: wearestudents
w
we
a
ar
are
s
st
stu
stud
stude
studen
student
students
true

apprenticeship>javac problem1.java

apprenticeship>java problem1
The List is: [we, doctors, are, nurses, and] the input is: wearenursesandoctors
w
we
a
ar
are
n
nu
nur
nurs
nurse
nurses
a
an
and
o
oc
oct
octo
octor
octors
false

apprenticeship>javac problem1.java

apprenticeship>java problem1
The List is: [we, doctors, are, nurses, and] the input is: wearenursesanddoctors
w
we
a
ar
are
n
nu
nur
nurs
nurse
nurses
a
an
and
d
do
doc
doct
docto
doctor
doctors
true

apprenticeship>

*/
