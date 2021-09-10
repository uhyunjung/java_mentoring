import java.io.*;

public class BJ2675_BR{
	public static void main(String[] args) throws IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(sc.readLine());
		String answer = "";
		
		for(int i=0; i<c; i++)
		{
			answer = "";
			
			String temp[] = sc.readLine().split(" ");
			int r = Integer.parseInt(temp[0]);
			String s = temp[1];
			
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