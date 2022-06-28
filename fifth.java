import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        System.out.println("Enter boolean value:");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if(x.equals("True") || x.equals("true")){
            System.out.println("the opposite of \"True\" is \"False\"");
        } else if (x.equals("False") || x.equals("false")){
            System.out.println("the opposite of \"False\" is \"True\"");
        }
    }
}