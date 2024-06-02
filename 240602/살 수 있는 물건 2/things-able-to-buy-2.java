import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int book = 3000;
        int mask = 1000;
        int pen = 500;

        if(n>=book){
            System.out.print("book");
        }else if(n<=book && n>=mask){
            System.out.print("mask");
        }else if(n<=mask && n>=pen){
            System.out.print("pen");
        }else{
            System.out.print("no");
        }
    }
}