import java.util.*;

public class Q3{
	public static void main(String[] args)
	{
		Practice p = new Practice();
		
		int temp = 1;
		
		p.varFunc(temp);
		System.out.println(temp);
		
		temp = p.addrFunc(temp);
		System.out.println(temp);
	}
}

class Practice{
	void varFunc(int a)
	{
		a+=1;
	}
	
	int addrFunc(int a)
	{
		a+=1;
		return a;
	}
}