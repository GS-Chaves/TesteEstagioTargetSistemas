import java.util.Scanner;

public class Q01 {
    public static boolean quadradoPerfeito(int n){
        int s = (int)Math.sqrt(n);
        return s * s == n;
    }

    public static boolean ehFibonacci(int n){
        return quadradoPerfeito(5 * n * n + 4) || quadradoPerfeito(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (ehFibonacci(n)) {
            System.out.println("Pertence a Fibonacci");
        } else {
            System.out.println("Não pertence a Fibonacci");
        }
    }
}
