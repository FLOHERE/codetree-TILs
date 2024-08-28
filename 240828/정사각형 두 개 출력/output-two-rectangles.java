import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                for(int k = 1; k<=n; k++){
                    System.out.print("*");
                    count++;
                }
                System.out.println(" ");
            }
            System.out.println(" ");

            if(count>=(n*n*2)){
                break;
            }

        }
    }
}