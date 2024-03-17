import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // \, ', " 을 출력할 때는 백슬래시(\)를 앞에 붙여 줘야 한다.
        // 자바의 출력문에서 백슬래시가 등장하는 순간 바로 다음 문자를 인식해 상황에 맞게 처리함
        // 이를 이스케이프 시퀀스(Escape Sequence)라고 한다.
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}
