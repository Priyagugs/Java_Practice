import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter number:");
                int n = scn.nextInt();
               int fact = 1;
                for(int i=1; i<=n; i++)
                {
                	 fact=fact*i;
                	
                }System.out.println("fact is "+fact);
                

	
	}

}
