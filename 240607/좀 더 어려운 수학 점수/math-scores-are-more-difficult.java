import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_Mscore = sc.nextInt();
        int A_Escore = sc.nextInt();
        
        int B_Mscore = sc.nextInt();
        int B_Escore = sc.nextInt();

        if(A_Mscore>B_Mscore){
            System.out.print("A");
        }else if(B_Mscore>A_Mscore){
            System.out.print("B");
        }

        if(A_Mscore==B_Mscore){
            if(A_Escore>B_Escore){
                System.out.print("A");
            }else{
                System.out.print("B");
            }
        }
    }
}