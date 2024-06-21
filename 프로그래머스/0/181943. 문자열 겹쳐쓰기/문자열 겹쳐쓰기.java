class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) { //my_string의 문자열 길이가 더 크면
            answer += my_string.substring(answer.length()); //answer 길이만큼 잘라서 answer뒤에 붙여 준다
        }
    
        return answer;
    }
}