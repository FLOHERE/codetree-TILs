import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double sum = 0;
        double cnt = 0;

        for(int i = a; i<=b; i++){
            if(a%5==0 || a%7==0){
                sum += a;
                cnt++;
            }
            a++;
        }
        System.out.printf("%.0f %.1f", sum,sum/cnt);
    }
}