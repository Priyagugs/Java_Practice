
public class quickSort {
	public static void main(String[] args) {
		int[] a={21,34,3,7,90,88,77};
		
		int leng=a.length;
		
		quickSort qr=new quickSort();
		qr.quickrecursion(a,0,leng-1);
		qr.printarray(a);
		
		
	}

	
	 int partition(int[] a,int lowerindex,int higherindex)
	{
		
		int pivot=a[(lowerindex+higherindex)/2];
		while(lowerindex<=higherindex)
		{
		while(a[lowerindex]<pivot)
		{
			lowerindex++;
		}
		while(a[higherindex]>pivot)
		{
			higherindex--;
		}
		if(lowerindex<=higherindex)
		{
			int temp=a[lowerindex];
			a[lowerindex]=a[higherindex];
			a[higherindex]=temp;
			
			lowerindex++;
			higherindex--;
		}
		
		
		}
		return lowerindex;
		}
	
	  void quickrecursion(int[]a,int low,int high)
	{
		int pi=partition(a,low,high);
		if(low<pi-1)
		{
			quickrecursion(a,low,pi-1);
		}
		if(pi<high)
		{
			quickrecursion(a,pi,high);
		}
		
		
	}
	
	void printarray(int[] a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");
	}
	}
	}

	

