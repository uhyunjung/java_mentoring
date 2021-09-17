import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE; // 최소 심사 시간
        
        long start, end, mid = 0, temp = 0; // temp 사람 수
        
        // 정렬
        Arrays.sort(times);
        start = 1;
        end = n * times[times.length-1];
        
        while(start<=end)
        {
            // n명 심사가 가능한지 궁금한 시간
            mid = (start+end)/2;
            temp=0;
            
            for(int i=0; i<times.length; i++)
            {
                // 사람 수
                temp += mid/times[i];
            }
            
            // 이미 확인한 mid => 더 작은 mid? end 줄임
            if(temp>=n)
            {
                answer = Math.min(answer, mid);
                end = mid - 1;
            }
            else // mid 불가능 => mid 큰 상황(start 올림)
            {
                start = mid + 1;
            }
        }

        return answer;
    }
}