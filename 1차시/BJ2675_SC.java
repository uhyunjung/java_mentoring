import java.util.*;

public class BJ2675_SC{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String answer = "";
		
		for(int i=0; i<c; i++)
		{
			answer = "";
			
			int r = sc.nextInt();
			String s = sc.next();

			for(int j=0; j<s.length(); j++)
			{
				for(int k=0; k<r; k++)
				{
					answer += s.charAt(j);
				}
			}
			
			System.out.print(answer);
		}
	}
}