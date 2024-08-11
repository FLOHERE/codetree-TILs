import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean result = true;

        for(int i = 1; i<=5; i++){
            n = sc.nextInt();
            if(n%3!=0){
                result = false;
                break;
            }
        }

        if(result==true){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}