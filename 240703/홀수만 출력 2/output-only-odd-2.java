import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int n;

        for(n=0; b>=a; b-=2){
            n = b;
            System.out.print(n + " ");
        }
        
    }
}