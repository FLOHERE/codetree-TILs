import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n;
        int cnt = 0;

        for(int i = 1; i <= n; i++){
            if(result / i <= 1){
                cnt++;
                break;
            }
            result = result / i;
            cnt++;
        }
        System.out.print(cnt);
        sc.close();
    }
}