class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int number = 1; //모든 원소들의 곱 변수
        int pow = 0; //모든 원소들의 합 제곱 변수
        
        //곱 변수와 합 제곱 변수를 구하기 위한 반복문
        for(int num : num_list){
            number *= num;
            pow += num;
        }
        
        //곱 변수와 제곱 변수를 비교하여 조건에 맞는 결과 리턴
        if(number < pow*pow){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}