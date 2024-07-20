import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            result = n/i;

            if(result/i<=1){
                break;
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}