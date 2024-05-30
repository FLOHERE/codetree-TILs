import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        int c = a+87;
        int d = b%10;

        System.out.println(c);
        System.out.println(d);
    }
}