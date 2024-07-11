import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<=n; i++){
            if(n>=90){
                System.out.print("A" + " ");
            }else if(n>=80 && n<90){
                System.out.print("B" + " ");
            }else if(n>=70 && n<80){
                System.out.print("C" + " ");
            }else if(n>60 && n<70){
                System.out.print("D" + " ");
            }else if(n<60){
                System.out.print("F" + " ");
            }
            if(n>=100){
                break;
            }else{
                n++;
            }
        }
        
    }
}