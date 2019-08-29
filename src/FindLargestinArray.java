import java.util.Scanner;

public class FindLargestinArray {
	
	
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int array[] = new int[n];
		  System.out.println("Enter all the elements:");
			for (int i = 0; i < array.length; i++)
			{
				array[i] = scn.nextInt();
			}
			
			int max=array[0];
			int max1= array[1];
			
			for(int j=1; j<array.length; j++)
			{ if(array[j]>max)
			{ max=array[j];
			}
			}
			
			System.out.println("Largest number is "+max);
			 
			
	}
	}


