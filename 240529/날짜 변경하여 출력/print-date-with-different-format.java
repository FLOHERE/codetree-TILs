import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");

        int yyyy;
        int mm;
        int dd;

        yyyy = sc.nextInt();
        mm = sc.nextInt();
        dd = sc.nextInt();

        System.out.print(mm + "-" + dd + "-" + yyyy);
    }
}