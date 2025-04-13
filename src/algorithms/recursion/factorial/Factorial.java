package algorithms.recursion.factorial;

public class Factorial {

    public static int factorial(int fat) {
        if (fat <= 1) return 1;
        else {
            return fat * factorial(fat - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
