import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Middle = sc.nextInt();
        int Final = sc.nextInt();
        
        if(Middle>=90 && Final>=95){
            System.out.print("100000");
        }else if(Middle>=90 && Final>=90){
            System.out.print("50000");
        }else{
            System.out.print("0");
        }
    }
}