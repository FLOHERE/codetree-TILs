import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int n = 0;
        int m = 0;

        if(a>=b){
            n = b;
            m = a;
        }else{
            n = a;
            m = b;
        }

        for(int i = n; i<=m; i++){
            if(n%5==0){
                sum += n;
            }
            n++;
        }
        System.out.print(sum);
    }   
}