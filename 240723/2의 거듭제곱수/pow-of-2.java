import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int cnt = 0;


        while(true){
            x*=2;
            cnt++;

            if(n==x){
                break;
            }
        }
        System.out.print(cnt);
    }
}