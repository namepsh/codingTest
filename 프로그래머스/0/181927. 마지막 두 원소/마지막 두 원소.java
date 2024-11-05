import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int len = num_list.length-1; //마지막 원소 인덱스
        answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        if(num_list[len] > num_list[len-1]){
            int num = num_list[len] - num_list[len-1];
            answer[len+1] = num;
        } else {
            int num = num_list[len] + num_list[len];
            answer[len+1] = num;
        }
        
        return answer;
    }
}