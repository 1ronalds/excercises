import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b1: ");
        String a = sc.nextLine();
        System.out.println("Enter b2: ");
        String b = sc.nextLine();

        if(a == b && (a == "True" || a == "true" || a == "false" || a == "False") && (b == "True" || b == "true" || b == "false" || b =="False")) {
            System.out.println("Is b1 and b2 equal? - true");
        } else if (a != b && (a == "True" | a == "true" | a == "false" | a == "False") && (b == "True" | b == "true" | b == "false" | b =="False")){
            System.out.println("Is b1 and b2 equal? - false");
        }

    }
}
