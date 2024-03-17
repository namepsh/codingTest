import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i<a.length(); i++){
            // String형 변수에서 글자 한 개씩 char형으로 바꿔서 대문자인지 소문자인지 판별해야 한다
            // charAt: String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수
            // i 자리에 int형 변수를 넣어서 원하는 위치의 문자를 가져올 수 있기 때문에 charAt(i)값을 저장
            // i는 순서를 의미
            char c= a.charAt(i);
            // isUpperCase는 입력 받은 인자가 영문 대문자인지 여부를 판단하여 true, false 값을 리턴
            // Character: char에 대한 래퍼 클래스(wrapper class)
            if(Character.isUpperCase(c)){
                // answer = answer + Character.toLowerCase
                // 소문자로 바꿔 준다
                answer += Character.toLowerCase(c);
            } else {
                // 대문자로 바꿔 준다
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}