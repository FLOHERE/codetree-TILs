import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        double sum = 0;
        int cnt = 0;

        while(true){
            age = sc.nextInt();

            if(age>=30 || age<20){
                System.out.printf("%.2f", sum/cnt);
                break;
            }

            cnt++;
            sum += age;


        }
        
    }
}