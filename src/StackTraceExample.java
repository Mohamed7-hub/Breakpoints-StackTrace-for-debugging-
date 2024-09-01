public class StackTraceExample {

    public static void main(String[] args) {
        String str = null; // Intentional error: str is null
        printLength(str);  // This will cause a NullPointerException
    }

    public static void printLength(String str) {
        // This line will throw a NullPointerException since str is null
        System.out.println("Length of the string: " + str.length());
    }
}
