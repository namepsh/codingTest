class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        double douA = Math.pow(a, 2);
        double douB = Math.pow(b, 2);
        double douC = Math.pow(c, 2);
        
        double doubleA = Math.pow(a, 3);
        double doubleB = Math.pow(b, 3);
        double douvbleC = Math.pow(c, 3);
        
        if(a != b && b != c && a != c){
            answer = a + b + c;
        } else if(a == b && b == c && a ==c){
            answer = (a + b + c) * (int)(douA + douB + douC) * (int)(doubleA + doubleB + douvbleC);
        } else {
            answer = (a + b + c) * (int)(douA + douB + douC);
        }
        return answer;
    }
}