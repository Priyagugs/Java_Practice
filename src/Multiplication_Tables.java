import java.util.Scanner;

public class Multiplication_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter number:");
                int n = scn.nextInt();
                int b=n;
                for(int i=1; i<=10; i++)
                {
                	n=b*i;
                	System.out.println(b+" * "+i+" = "+n);
                }

	}

}
