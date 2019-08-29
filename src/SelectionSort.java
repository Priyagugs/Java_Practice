
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In selection sort algorithm, we search for the lowest element and arrange it to the proper location. 
		//We swap the current element with the next lowest number.
		//arr[] = 25 35 45 12 65 10  
				  
				// Find the minimum element in arr[0...5] and place it at beginning.  
				  
			//	10 25 35 45 12 65   
				  
				// Find the minimum element in arr[1...5] and place it at beginning of arr[1...5]  
				  
			//	10 12 25 35 45 65   
				  
				// Find the minimum element in arr[2...5] and place it at beginning of arr[2...5]  
		//		No, you can see that the array is already sorted.   
				  
			//	10 12 25 35 45 65   
int[] a={78,6,46,2,100,169};
int min;
int temp=0;
for(int i=0;i<a.length;i++)
{min=i;
	for(int j=i+1; j<a.length; j++)
	{
		if(a[j]<a[min])
		{
			min=j;
		}
	}
	
	temp=a[i];
	a[i]=a[min];
	a[min]=temp;
	
}
		for(int k=0; k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
	}

}
