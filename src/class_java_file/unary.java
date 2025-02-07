public class unary {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("A Is: "+ a);
//        post Increment
        int b = a++;
        System.out.println("A Is: "+ a +" B IS: "+ b);
//        pre Increment
        int c = ++a;
        System.out.println("C Is: "+ c);

        int r = 5;
        System.out.println("R Is: "+ r);
//        post Decrement
        int s = r--;
        System.out.println("R Is: "+ r +" S IS: "+ s);
//        pre Decrement
        int t = --r;
        System.out.println("T Is: "+ t);

    }
}
