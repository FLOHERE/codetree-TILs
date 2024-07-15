import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n<=100){
            sum += n;
            n++;
        }
        System.out.print(sum);
    }
}