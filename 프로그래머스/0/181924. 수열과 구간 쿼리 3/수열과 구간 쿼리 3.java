class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            
            int idx1 = queries[i][0]; // 배열 안의 배열에 있는 0번째 수만 추출 - 0, 1, 1
            int idx2 = queries[i][1]; // 배열 안의 배열에 있는 1번째 수만 추출 - 3, 2, 4
            
            int temp = arr[idx1]; // arr 배열의 arr[idx1]번째 수를 temp에 저장(초기화 역할)
            arr[idx1] = arr[idx2]; // arr[idx1]번째 수를 idx2번째 수로 치환
            arr[idx2] = temp; // arr[idx2]번째 수를 idx1번째 수로 치환
        }
        
        return arr;
    }
}