import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<=n-1; i++){
            for(int j = i; j>=0; j--){
                System.out.print("*");
                
            }
            System.out.println(" ");
            System.out.println(" ");
        }
        for(int i = n-1; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
                
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }
}