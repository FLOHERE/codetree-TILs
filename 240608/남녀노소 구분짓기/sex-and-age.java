import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if(gender==0 && age>=19){
            System.out.print("MAN");
        }else if(gender==0 && age<=19){
            System.out.print("BOY");
        }

        if(gender==1 && age>=19){
            System.out.print("WOMAN");
        }else if(gender==1 && age<=19){
            System.out.print("GIRL");
        }
    }
}