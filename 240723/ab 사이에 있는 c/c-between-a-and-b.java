import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prod = 1;
        int n = 1;
        boolean result = false;
        

        for(int i = a; i<=b; i++){
            prod = c*n;
            n++;
            if(a<=prod && b>=prod){
                result = true;
            }
        }
        if(result == true){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}