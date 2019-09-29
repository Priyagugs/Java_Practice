package StringPrograms;

public class CountNumberofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str="My Name is Priya";
		int count=0;
		for(int i=0; i<Str.length();i++)
		{
			if(Str.charAt(i)!=' ')
			{
				count=count+1;
			}
			
		}
		
		System.out.println("Total number of characters in a string: " + count);   
	}

}
