import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        double sum = 0;
        double cnt = 0;

        for(int i = 1; i<=n; i++){
            a = sc.nextInt();
            sum += a;
            cnt++;
        }
        System.out.printf("%.0f %.1f", sum,sum/cnt);

    }
}