import java.util.Scanner;

public class BJ1543 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int cnt = 0 ;
		
		for(int i = 0; i < a.length() - b.length() +1; i++) {
			if(a.substring(i,i+b.length()).equals(b)) {
				cnt++;
				i += b.length() - 1;
			}
			else continue;
		}		
		
		System.out.println(cnt);
	}
}