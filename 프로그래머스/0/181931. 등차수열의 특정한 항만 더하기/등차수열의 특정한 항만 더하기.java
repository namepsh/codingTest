class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0; i<included.length; i++){
           if(included[i] == true){
               answer += ((i * d) + a);
               System.out.println((i * d) + a);
           }
        }
        return answer;
    }
}