import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a에서 b까지의 홀수를 오름차순으로 출력
        for (int i = a; i <= b; i += 2) {
            System.out.print(i);
            if (i + 2 <= b) {
                System.out.print(" ");
            }
        }
    }
}