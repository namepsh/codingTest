class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(Integer.parseInt(a+""+b) < 2 * a * b){
            answer = 2 * a * b;
        } 
        if(Integer.parseInt(a+""+b) >= 2 * a * b){
            answer = Integer.parseInt(a+""+b);
        }
        return answer;
    }
}