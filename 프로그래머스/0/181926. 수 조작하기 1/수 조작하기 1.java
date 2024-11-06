class Solution {
    public int solution(int n, String control) {
        String[] arr = control.split("");

        for(String controlStr : arr){
            if(controlStr.equals("w")){
                n += 1;
            } else if(controlStr.equals("s")){
                n -= 1;
            } else if(controlStr.equals("d")){
                n += 10;
            } else if(controlStr.equals("a")){
                n -= 10;
            }
        }
        
        return n;
    }
}