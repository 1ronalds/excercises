import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = sc.nextInt();
        System.out.println("Enter value b: ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("is " + a + " equal to " + b + "? - true");
        } else {
            System.out.println("is " + a + " equal to " + b + "? - false");
        }

        if(a < b){
            System.out.println("is " + a + " less than " + b + "? - true");
        } else {
            System.out.println("is " + a + " less than " + b + "? - false");
        }

        if(a <= b){
            System.out.println("is " + a + " less or equal to " + b + "? - true");
        } else {
            System.out.println("is " + a + " less or equal to " + b + "? - false");
        }

        if(a > b){
            System.out.println("is " + a + " grater than " + b + "? - true");
        } else {
            System.out.println("is " + a + " grater than " + b + "? - false");
        }

        if(a >= b){
            System.out.println("is " + a + " grater or equal to " + b + "? - true");
        } else {
            System.out.println("is " + a + " grater or equal to " + b + "? - false");
        }

    }
}


/*is 10 equal to 10? - true
               is 10 less than 10? - false
               is 10 less or equal to 10? - true
               is 10 greater than 10? - false
               is 10 greater or equal to 10? - true
*/
