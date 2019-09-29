package StringPrograms;

public class Count_Vowels_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Good Morning";
		String str1=str.toLowerCase();
	
		int vowels_count=0;
		int conso_count=0;
		for(int i=0; i<str1.length();i++)
		{
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				vowels_count=vowels_count+1;
			}
			else
			{
				conso_count=conso_count+1;
			}
			
		}
		
		System.out.println("Total number of characters in a string: " + vowels_count); 
		System.out.println("Total number of characters in a string: " + conso_count); 

	}

}
