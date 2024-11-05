class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String even = ""; // 짝수
        String odd = "";  // 홀수
        
        for(int num : num_list){
            if(num % 2 == 0){
                even += num;
            } else {
                odd += num;
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);

        return answer;
    }
}