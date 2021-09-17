import java.io.*;
//프로그래머스에서는 main함수 및 입출력문이 필요하지 않습니다. 대신 solution함수만 작성하면 됩니다.
public class Main {
	static String solution(String s){
		String answer = "";   // String 문제는 인덱스접근 => 함수로 접근
		int count = 0;
		
		if(s.charAt(0) == '1') answer += '1';
		
		for(int i=0; i<s.length() - 1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				count++;// 반복횟수
			}
			else
			{
				answer += (char)('A'+ count);
				count = 0;
			}
		}
		
		answer += (char)('A'+count);
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String answer= solution(input);
		
		System.out.println(answer);
	}
}