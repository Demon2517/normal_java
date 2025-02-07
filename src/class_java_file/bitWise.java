public class bitWise {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        System.out.println("a & b: " + (a & b));  // Output: 1
        System.out.println("a | b: " + (a | b));  // Output: 7
        System.out.println("a ^ b: " + (a ^ b));  // Output: 6
        System.out.println("~a: " + (~a));        // Output: -6
        System.out.println("a << 1: " + (a << 1)); // Output: 10
        System.out.println("a >> 1: " + (a >> 1)); // Output: 2
        System.out.println("a >>> 1: " + (a >>> 1)); // Output: 2
    }
}
