import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;

        for(int i = a; i<=b; i++){
            if(a%2==0){
                sum+=a;
            }
            a++;
        }
        System.out.print(sum);
    }
}