import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            result = n/i;

            if(result/i<=1){
                if(result/i==0){
                    cnt++;
                    break;
                }
                break;
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}