import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();//20
        int a = sc.nextInt();//10

        while(a<=b){
            System.out.print(b + " ");
            b-=2;
        }
    }
}