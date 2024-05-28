import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h;
        int m;

        h = sc.nextInt();
        m = sc.nextInt();
        
        System.out.print(h+1 + ":" + m);
    }
}