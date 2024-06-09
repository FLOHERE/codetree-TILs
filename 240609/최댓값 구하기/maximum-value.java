import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a; // Assume 'a' is the largest initially

        if (b > max) {
            max = b; // If 'b' is greater than current 'max', update 'max'
        }
        
        if (c > max) {
            max = c; // If 'c' is greater than current 'max', update 'max'
        }
        
        System.out.print(max); // Print the largest value

        sc.close();
    }
}