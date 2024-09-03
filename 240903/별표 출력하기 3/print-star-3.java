import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
			for (int j = n; j > i; j-=1) {  //처음에 n과 i의 값이 같으니까 생략
				System.out.print("  ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
    }
}