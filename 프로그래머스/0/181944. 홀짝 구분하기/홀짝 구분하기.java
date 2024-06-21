import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 == 0){ //짝수일 경우
            System.out.println(n + " is even");
        } else{       //홀수일 경우
            System.out.println(n + " is odd");
        }
    }
}