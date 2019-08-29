
//In bubble sort algorithm, array is traversed from first element to last element. Here, current element is compared with the next element. 
//If current element is greater than the next element, it is swapped.

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={12,78,65,98,34};
		int temp;
		for(int i=0; i<a.length;i++)
		{
			for( int j=i+1;j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			System.out.println(a[i]);
			
		}
		
		
		

	}

}
