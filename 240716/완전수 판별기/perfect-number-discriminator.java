import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = 0;

        for(int i = 1; i<=n; i++){
            sum = n/i;
            if(sum==n){
                System.out.print("P");
                break;
            }else{
                System.out.print("N");
                break;
            }
        }
    }
}