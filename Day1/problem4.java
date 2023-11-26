import java.util.*;
class problem4{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first string:  ");
		String str1=scan.next();
		System.out.print("Enter the second string: ");
		String str2=scan.next();
		System.out.println(newequalfunction(str1,str2));
	}
	public static boolean newequalfunction(String s1,String s2){
		if(s1.equals(s2))
		return true;
		if(s1.length()!=s2.length())					//if size of the two strings are not equal then return false;
		return false;
		int i=0;
		for(i=0;i<s1.length();++i){					//this for loop is locate the first letter of str1 in str2
			if(s1.charAt(0)==s2.charAt(i))
			break;
		}
		int o=0;
		for(int j=i;j<s2.length();++j){					//this loop is to check if consecutive letters of str2 after
			if(s2.charAt(j)!=s1.charAt(o++))			//located word are same if not return false
			return false;
		}
		String substr="";
		for(int k=0;k<i;++k)						//this loop is get the part of the str2 before the 
		substr+=s2.charAt(k);						//located word
		if(s1.contains(substr))						//if it conatins in the str1 return true
		return true;
		return false;							//else return false
	}
}


/*

Output:
apprenticeship>javac problem4.java

apprenticeship>java problem4
Enter the first string:  abcd
Enter the second string: cdab
true

apprenticeship>java problem4
Enter the first string:  abcd
Enter the second string: cdba
false

apprenticeship>java problem4
Enter the first string:  123456
Enter the second string: 456123
true

apprenticeship>java problem4
Enter the first string:  123456
Enter the second string: 412356
false

apprenticeship>java problem4
Enter the first string:  India
Enter the second string: ndiaI
true

apprenticeship>java problem4
Enter the first string:  India
Enter the second string: diaIn
true

apprenticeship>java problem4
Enter the first string:  India
Enter the second string: adIni
false

apprenticeship>

*/