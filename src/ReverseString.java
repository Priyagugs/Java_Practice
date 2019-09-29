
public class ReverseString {

	public static void main(String[] args) {
		String concat="";
		String str="PRIYA";
		int len=str.length();
		for( int i=len-1; i>=0; i--)
		{
			char c=str.charAt(i);
			
			concat=concat+c;
			
		}
		System.out.println(concat);

	}

}
