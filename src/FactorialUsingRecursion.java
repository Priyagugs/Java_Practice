import java.util.Scanner;

public class FactorialUsingRecursion {
	static int fact=1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		FactorialUsingRecursion fc=new FactorialUsingRecursion();
		fc.CallFact(num);
		System.out.println("Fact is "+fact);

	}
	
	public void CallFact(int num)
	{
		
		if(num>=1)
		{
			fact=fact*num;
			 CallFact(num-1);
		}
		
		
		
		
	}

}
