package algorithms.recursion.factorial;

public class Factorial {

    public static int fatorial(int numero) {
        if (numero == 1) return 1;
        else {
            return numero * fatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
}
