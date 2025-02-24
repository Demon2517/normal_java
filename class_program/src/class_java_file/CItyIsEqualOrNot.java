package class_java_file.class_java_file;

public class CItyIsEqualOrNot {
    public static void main(String[] args) {
        String city = "Dadva";
        if (city == "Jasdan")
            System.out.println("City Name IS Jasdan.");
        else if (city == "Atkot") {
            System.out.println("City Name Is Atkot.");
        } else if (city == "Rajkot") {
            System.out.println("City Name Is Rajkot.");
        }else
            System.out.println("City Name Is "+ city);
    }
}
