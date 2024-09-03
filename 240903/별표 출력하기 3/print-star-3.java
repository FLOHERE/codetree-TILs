import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {                //아래쪽 삼각형
			for (int j = n; j > i; j-=1) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
    }
}