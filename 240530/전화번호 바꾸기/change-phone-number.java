import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        int First;
        int Middle;
        int last;

        First = sc.nextInt();
        Middle = sc.nextInt();
        last = sc.nextInt();

        System.out.print("0" + First + "-" + last + "-" + Middle);
    }
}