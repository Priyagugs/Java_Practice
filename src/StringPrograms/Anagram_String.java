package StringPrograms;

public class Anagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="triangle";
		String str2="integral";
		
		String str1upp=str1.toUpperCase();
		String str2upp=str2.toUpperCase();
		int count=0;
		
		if(str1.length()==str2.length())
		{
			for(int i=0; i<str1.length();i++)
			{
				for(int j=0; j<str2.length();j++)
				{
					if(str1upp.charAt(i)==str2upp.charAt(j))
					{
						count++;
					}
				}
			}
			
			if(count==str1.length())
			{
				System.out.println("str is anagram");
			}
			
			else
			{
				System.out.println("str is not anagram");
			}
			}
		
	
	else
	{
		System.out.println("str is not anagram");
	}
	}

	}


