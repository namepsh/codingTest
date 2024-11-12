import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE); //최대값으로 초기화
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    answer[i]=Math.min(arr[j], answer[i]); //최소값
                }
            }
            
            if(answer[i] == Integer.MAX_VALUE){ //해당 조건에 부합한 수가 존재하지 않을경우 
                answer[i]=-1;
            }
        }
        return answer;
    }
}