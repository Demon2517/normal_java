package String_In_Java;

public class builderClassMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Solanki");
        System.out.println(sb);

        // setCharAt user to set char in old str
        sb.setCharAt(0,'R');
        System.out.println(sb);

        //insert the char in indexing we pass
//        sb.insert(1,'S');
        //Both are same
        System.out.println(sb.insert(1,'s'));

        //delete the str
//        sb.delete(2,sb.length());
        System.out.println(sb.delete(0,1));

        //Append the str
        //In Args : "str", 'char'
        System.out.println(sb.append("Rumit"));
    }
}
