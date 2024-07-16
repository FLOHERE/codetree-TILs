import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        double cnt = 0;

        for(int i = 1; i<=10; i++){
            n = sc.nextInt();
            if(n>=0 && n<=200){
                sum+=n;
                cnt++;
            }
        }

        System.out.printf("%.0f %.1f", sum,sum/cnt);
    }
}