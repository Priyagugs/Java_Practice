package StringPrograms;

public class Count_total_Punctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Good Morning! Mr. James Potter. Had your breakfast?";
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='!' ||str.charAt(i)=='.'|| str.charAt(i)==','||str.charAt(i)=='?'||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':' )
			{
				count=count+1;
			}
		}
		
		System.out.println("Total number of characters in a string: " + count);   
	}

}
