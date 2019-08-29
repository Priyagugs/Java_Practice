//12, 11, 13, 5, 6

/*Let us loop for i = 1 (second element of the array) to 4 (last element of the array)

i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
11, 12, 13, 5, 6

i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
11, 12, 13, 5, 6

i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
5, 11, 12, 13, 6

i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
5, 6, 11, 12, 13*/
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr={10,81,21,14,65};
 int temp,j;
 for( int i=1; i<arr.length; i++)
{
	temp=arr[i];
	j=i;
	
	while(j>0 && arr[j-1]>temp)
	{
		arr[j]=arr[j-1];
		
		j=j-1;
	}
	arr[j]=temp;
}
 
 for(int i=0; i<arr.length; i++)
	 System.out.print(arr[i]+" ");
 
	}

}
