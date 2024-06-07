import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        char gender1 = sc.next().charAt(0);

        int age2 = sc.nextInt();
        char gender2 = sc.next().charAt(0);

        if((age1 >= 19 && gender1=='M')||(age2>=19 && gender2=='M')){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
        //String으로 하면 안되는 이유 : 참조값으로 받아서 String 으로 하려면 .equal 함수 사용
    }
}