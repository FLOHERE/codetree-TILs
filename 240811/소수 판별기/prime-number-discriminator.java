import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = true;

        for(int i = 1; i<=n; i++){
            if(n%i!=0){
                result = false;
                break;
            }
        }
        if(result==true){
            System.out.print("P");
        }else{
            System.out.print("C");
        }
    }
}