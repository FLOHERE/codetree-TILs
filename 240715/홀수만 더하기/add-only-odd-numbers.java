import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int sum = 0;

        for(int i = 1; i<=n; i++){
            a = sc.nextInt();
            if(a%2==1 && a%3==0){
                sum = sum + a;
            }
        }
        System.out.print(sum);
    }
}