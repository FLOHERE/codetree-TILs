import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        int lastNum;
        int juminNum;
        juminNum = sc.nextInt();
        lastNum = sc.nextInt();

        System.out.print(juminNum);
        System.out.print(lastNum);
    }
}