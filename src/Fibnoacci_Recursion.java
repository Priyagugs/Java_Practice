
public class Fibnoacci_Recursion {
	
	static int count=10,a=0,b=1;

	public static void main(String[] args) {
		
		 System.out.print(a+" "+b);
		// TODO Auto-generated method stub
		Fibnoacci_Recursion fr=new Fibnoacci_Recursion();
		fr.CallFib(count-2);
		 
			

	}
	
	void CallFib(int count)
	
	{
	
	if(count>0)
	{
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		CallFib(count-1);
	}
	
		
	}

}
