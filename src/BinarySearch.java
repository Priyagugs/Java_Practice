
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={10,20,30,40,50,70,90};
		int last=a1.length;
	int result=	BinarySearch(a1,0,last,20);
	
	if(result==-1)
	{
		System.out.println("value is not present");
	}
	
	else
	{
		System.out.println("value is present at index "+result);
	}
	}

	 static int BinarySearch(int[] a1,int first,int last, int key) {
		 
		 //int len=a1.length;
		 int mid=first+(last-first)/2;
		 if(key==a1[mid])
		 {
			return mid; 
		 }
		 if(key>a1[mid])
		 {
			return BinarySearch(a1,mid+1,last,key);
		 }
		 
		 if(key<a1[mid])
		 {
			return BinarySearch(a1,0,mid-1,key);
		 }
		 
		 
		return -1;
		
		
	}

	
}
