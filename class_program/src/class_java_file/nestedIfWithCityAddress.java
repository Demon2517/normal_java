package class_java_file.class_java_file;

public class nestedIfWithCityAddress {
    public static void main(String[] args) {
        String address = "Vadodara, Gujrat, India";
        if(address.endsWith("India")) {
            if(address.contains("Surat")) {
                System.out.println("Your city is Surat");
            }else if(address.contains("Vadodara")) {
                System.out.println("Your city is Vadodara");
            }else
                System.out.println(address.split(",")[0]);
        }else
            System.out.println("You are not living in India");
    }
}
