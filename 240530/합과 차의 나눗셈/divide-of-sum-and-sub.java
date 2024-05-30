import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        a = sc.nextInt();
        b = sc.nextInt();
        double sum = a+b;
        double minus = a-b;

        double c = sum/minus;

        System.out.printf("%.2f",c);
    }
}