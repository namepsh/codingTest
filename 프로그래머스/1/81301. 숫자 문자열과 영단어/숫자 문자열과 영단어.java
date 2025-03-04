class Solution {
    public int solution(String s) {
        // 설명에 제시된 영단어로 배열 생성
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 배열 길이 반복문(배열 인덱스와 영단어 동일)
        for(int i=0; i<arr.length; i++){
            // s에 배열과 동일한 영단어가 있을 경우
            if(s.contains(arr[i])){
                // 인덱스, 인덱스를 문자열로 변환
                s = s.replace(arr[i], Integer.toString(i));
            }
        }
        
        // 치환된 문자열 s를 숫자로 변경
        return Integer.parseInt(s);
    }
}