import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minus = n-1;
        boolean result = false;

        for(int i = 2; i<=minus; i++){

            if(n%i==0){
                result = true;
                break;
            }
            

        }
        if(result==true){
            System.out.print("C");
        }else{
            System.out.print("N");
        }

    }
}