import java.util.*;
import java.io.*;
class problem3{
	public static void main(String args[]){
		String substr="";
		ArrayList<String> unique=new ArrayList<String>();
		ArrayList<Integer> no_times=new ArrayList<Integer>();
		try{
			FileReader frobj=new FileReader("textfile.txt");
			int i=0;
			while((i=frobj.read())!=-1){
				if((char)i=='\n' || (char)i==' '){
					if(substr.length()!=4){
						substr="";
						continue;
					}
					if(amnotin(substr,unique))
					unique.add(substr);
					substr="";
				}
				else
				substr+=(char)i;
			}
			if(amnotin(substr,unique))
			unique.add(substr);

			FileWriter fwobj=new FileWriter("textfile.txt");
			for(int j=0;j<unique.size();++j){
				fwobj.write("\n");
				fwobj.write(unique.get(j)+"");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("The unique 4letter words in the file: ");
		for(int i=0;i<unique.size();++i)
		System.out.println(unique.get(i));
		
	}
	public static boolean amnotin(String str,ArrayList<String> li){
		for(int i=0;i<li.size();++i){
			if(str.equals(li.get(i)))
			return false;
		}
		return true;
	}
}

/*

Output:
apprenticeship>javac problem3.java

apprenticeship>java problem3
The unique 4letter words in the file:
four
word
file
bear
from
text
hour

apprenticeship>

*/
