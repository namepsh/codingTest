class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int before = 0;
        for(int i=0; i<numLog.length; i++){
            
            if(numLog[i] == before + 1){
                answer += "w";
            } else if(numLog[i] == before - 1){
                answer += "s";
            } else if(numLog[i] == before + 10){
                answer += "d";
            } else if(numLog[i] == before - 10){
                answer += "a";
            }
            
            before = numLog[i];
        }
        return answer;
    }
}