import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int garo;
        int sero;

        garo = sc.nextInt();
        sero = sc.nextInt();

        System.out.println(garo+8);
        System.out.println(sero*3);
        System.out.println((garo+8)*(sero*3));
    }
}