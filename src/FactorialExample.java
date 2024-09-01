public class FactorialExample {

    public static void main(String[] args) {
        int number = 5; // You can set a breakpoint here to inspect 'number'
        int result = calculateFactorial(number); // You can also set a breakpoint here to inspect 'result'
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i; // Set a breakpoint here to inspect 'factorial' during each iteration
            }
            return factorial;
        }
    }
}
