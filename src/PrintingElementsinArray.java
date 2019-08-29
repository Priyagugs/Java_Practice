
public class PrintingElementsinArray {

	public static void main(String args[])
	{
		int[] a={10,20,30};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		int[][] b={{10,20},{56,78}};
		for(int i=0; i<b.length; i++)
		{
			for( int j=0; j<b[i].length;j++)
			
			System.out.println(b[i][j]);
		}
		
		int[][][] c={{{10,20},{56,78},{45,78,65,89},{90,86}}};
		for(int i=0; i<c.length; i++)
		{
			for( int j=0; j<c[i].length;j++)
			{
				for(int k=0; k<c[i][j].length;k++)
				{
					System.out.println(c[i][j][k]);
				}
				System.out.println();
				}
			
			
		}
	}
}
