package algorithms.recursion.fibonacci;

public class Fibonacci {
    public static int recursive(int num) {
        if (num <= 1) return num;
        else {
            return recursive(num - 1) + recursive(num - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(6));
        // 1 1 2 3 5 8 ..
    }
}
