import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            int subStr = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(k < subStr){
                arr.add(subStr);
            }
        }
        
        return arr.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}