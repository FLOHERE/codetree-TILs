import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%1==0 && n%n==0){
            System.out.print("P");
        }else{
            System.out.print("C");
        }
    }
}