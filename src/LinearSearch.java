
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a1={10,20,30,40,50,70,90};
		int result=linearSearch(a1, 90);
		
		if(result==-1)
		{
			System.out.println("value is not present ");
		}
		
		else
		{
			System.out.println("value is present at index "+result);
		}
		
		
		
		
		
	
	}
	
	   static int linearSearch(int arr[],int key)
	{
		 int i;
			
			
		 
			
			for( i=0; i<arr.length; i++)
			{
				if(key==arr[i])
				{
					 return i;
					
				}
				
			
			}
			return -1;
	}

}
