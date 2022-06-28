import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b1: ");
        String a = sc.nextLine();
        System.out.println("Enter b2: ");
        String b = sc.nextLine();

        if(a.equals(b) && (a.equals("True") || a.equals("true") || a.equals("false") || a.equals("False")) && (b.equals("True") || b.equals("true") || b.equals("false") || b.equals("False"))) {
            System.out.println("Is b1 and b2 equal? - true");
        } else if (!a.equals(b) && (a.equals("True") || a.equals("true") || a.equals("false") || a.equals("False")) && (b.equals("True") || b.equals("true") || b.equals("false") || b.equals("False"))){
            System.out.println("Is b1 and b2 equal? - false");
        }

    }
}
