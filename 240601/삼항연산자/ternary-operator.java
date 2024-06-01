import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        int pass;


        pass = score>=100 ? 1 : 0;

        if(pass==1){
            System.out.print("pass");
        }else{
            System.out.print("failure");
        }
    }
}