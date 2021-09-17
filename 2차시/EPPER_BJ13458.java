import java.io.*;

class Main {
    static int n, B, C;
    static int[] A;
    
    static long Solution() {
        long answer= 0;
        
        for(int i=0;i<n;i++) {
            // 총 감독관
            A[i] = A[i]-B;
            answer++;
            
            // 부 감독관 필요한 경우
            if (A[i] > 0)
            {
            	// 남은 응시자 수 / 부 감독관이 감시할 수 있는 사람 수 = 필요한 부 감독관 수
            	answer += A[i]/C;
            	
            	// 나머지 응시자 수가 있으면 부 감독관 수 1명 추가
            	if(A[i]%C > 0)
            	{
            		answer++;
                }   
            }  
        }
        return answer;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        A = new int[n];
        
        String input = br.readLine();
        String[] arr = input.split(" ");
        
        for(int i=0;i<n;i++)
            A[i] = Integer.parseInt(arr[i]);
        
        input = br.readLine();
        arr = input.split(" ");
        B = Integer.parseInt(arr[0]);
        C = Integer.parseInt(arr[1]);
        
        System.out.println(Solution());
    }
}
