import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>0){
            for(int n = 0; n<b; n++){
                System.out.print(a);
            }
        }else{
            System.out.print("0");
        }

    }
}