package StringPrograms;

public class Largest_Smallest_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hardships often prepare ordinary people for an extraordinary destiny";
String words[]=str.split(" ");
int biggestlength=0;
String biggest="";

for( int i=0; i<words.length; i++)
{
	
	if(words[i].length()>biggestlength)
	{
		biggest=words[i];
		biggestlength=words[i].length();
	}
		
	
}

System.out.println(biggest+ " "+biggestlength);
	
		
	}

}
