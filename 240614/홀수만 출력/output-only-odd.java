import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt(); // n 변수 추가 선언 및 입력 받기

        if(a >= n && b <= n) { // a가 n 이상이고 b가 n 이하인 경우
            if(n % 2 == 1) { // n이 홀수인 경우
                for(int i = 0; i < n; i++) { // n번 반복
                    System.out.print(n + " ");
                }
            }
        }

    }
}