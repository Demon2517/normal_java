import java.util.*;

public class averageNumber {
    public static int averageN(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static int oddSum(int odd){
        int sum=0;
        for (int i=1; i<=odd; i++){
            if (i%2 == 1)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Values For A,B,C : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter Value For OddN : ");
        int odd = sc.nextInt();

        System.out.println("Average Is : "+ averageN(a,b,c));

        System.out.println("All N Odd NUmber Sum Is : "+ oddSum(odd));
    }

}
