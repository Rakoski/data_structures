package algorithms.fibonacci;

public class Fibonacci {
    public static int recursive(int num) {
        if (num <= 1) {
            return num;
        }
        return recursive(num - 1) + recursive(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(recursive(8));
    }
}
