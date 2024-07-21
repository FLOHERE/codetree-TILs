import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width;
        int height;
        char c;
        int result;

        while(true){
            result = 1;

            width = sc.nextInt();
            height = sc.nextInt();
            c = sc.next().charAt(0);

            result = width*height;
            System.out.println(result);

            if(c==67){
                break;
            }
        }
       

    }
}