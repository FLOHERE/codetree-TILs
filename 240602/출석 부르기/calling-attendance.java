import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String Aclass1 = "John";
        String Aclass2 = "Tom";
        String Aclass3 = "Paul";

        if(input == 1){
            System.out.print(Aclass1);
        }else if(input==2){
            System.out.print(Aclass2);
        }else if(input==3){
            System.out.print(Aclass3);
        }
    }
}