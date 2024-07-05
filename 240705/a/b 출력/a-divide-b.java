import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        
        double result = a / b;
        result = Math.floor(result * 1e20) / 1e20;
        
        System.out.printf("%.20f", result);
    }
}