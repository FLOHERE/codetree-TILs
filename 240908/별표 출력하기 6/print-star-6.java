import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i>0; i--){
            for(int j = n; j>i; j--){
                System.out.print("  ");
            }

            for(int j = n; j>(2*n)-(2*i)-n+1; j--){
                System.out.print("* ");
            }
           
            System.out.println();
        }

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<=n-i-3; j++){
                System.out.print("  ");
            }

            for(int j = 0; j<n+(2*i)-1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}