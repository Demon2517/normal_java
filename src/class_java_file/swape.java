public class swape {
    public static void main(String[] args) {
        float first = 12.51F;
        float second = 24.01F;
        System.out.println("Before Swape Number :");
        System.out.println("First Is :" + first);
        System.out.println("second Is :" + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("Before Swape Number :");
        System.out.println("First Is :" + first);
        System.out.println("second Is :" + second);
    }
}
