public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int temp;

        temp = b;
        b = a;
        a = temp;

        System.out.println(a);
        System.out.println(b);
    }
}