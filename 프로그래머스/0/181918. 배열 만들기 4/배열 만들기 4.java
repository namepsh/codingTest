import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        
        ArrayList<Integer> stkArr = new ArrayList<>();
        
        while(i < arr.length){ // arr 길이보다 작을 경우
            if(stkArr.size() == 0){ // stkArr가 빈 리스트일 경우
                stkArr.add(arr[i]);
                i += 1;
            } else {
                if(stkArr.get(stkArr.size()-1) < arr[i]){
                    stkArr.add(arr[i]);
                    i += 1;

                } else {
                    stkArr.remove(stkArr.size()-1);
                }
            }
        } 
        
        int[] stk = stkArr.stream()
                       .mapToInt(Integer::intValue)
                       .toArray();
        
        return stk;
    }
}