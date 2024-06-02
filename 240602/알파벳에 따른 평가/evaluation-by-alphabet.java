import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpabet = sc.next().charAt(0);

        if(alpabet=='S'){
            System.out.print("Superior");
        }else if(alpabet=='A'){
            System.out.print("Excellent");
        }else if(alpabet=='B'){
            System.out.print("Good");
        }else if(alpabet=='C'){
            System.out.print("Usually");
        }else if(alpabet=='D'){
            System.out.print("Effort");
        }else{
            System.out.print("Failure");
        }
     
    }
}