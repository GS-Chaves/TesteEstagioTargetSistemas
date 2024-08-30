import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toLowerCase();
        char[] chars = string.toCharArray();
        int contador = 0;
        boolean existe = false;

        for (char c : chars) {
            if (c == 'a') {
                existe = true;
                contador++;
            }
        }

        if (existe) {
            System.out.println("Existe 'a' e apareceu " + contador + " vezes");
        } else {
            System.out.println("Nao existe 'a'");
        }
    }
}
