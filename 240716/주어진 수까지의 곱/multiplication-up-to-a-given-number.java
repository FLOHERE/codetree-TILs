import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int prod = 1;

        for(int i = a; i<=b; i++){
            prod *= a;
            a++;
        }
        System.out.print(prod);
    }
}