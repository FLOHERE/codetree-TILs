import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;

        for(int i = 1; i<=a; i++){
            if((i%2==0) && (i%4!=0)){
                continue;
            }

            n = i/8;
            if(n%2==0){
                continue;
            }

            if(i%7<4){
                continue;
            }

            System.out.print(i + " ");
        }
        
    }
}