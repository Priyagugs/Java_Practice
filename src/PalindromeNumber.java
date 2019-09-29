import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rev=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
	int	num1=num;
		while(num!=0)
		{
			int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		
			
		}
		
		System.out.println("rev is "+rev);
		if(num1==rev)
		{
			System.out.print("Number is palindrome");
			
		}
		else
		{
			System.out.print("Number is not palindrome");
		}
	}

}
