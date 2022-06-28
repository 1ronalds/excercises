/* 6) Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
    1) a and b is equal
    2) a is less than 0 and b is greater than 0
    3) both of them are greater than 100
*/
import java.util.Scanner;

public class sixth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = sc.nextInt();
        System.out.println("Enter value b: ");
        int b = sc.nextInt();

        if(a == b || (a<0 && b>0) || (a>100 && b>100)){
            System.out.println("a is " + a + " and b is " + b + " - true");
        } else {
            System.out.println("a is " + a + " and b is " + b + " - false");
        }

    }
}


/*is 10 equal to 10? - true
               is 10 less than 10? - false
               is 10 less or equal to 10? - true
               is 10 greater than 10? - false
               is 10 greater or equal to 10? - true
*/
