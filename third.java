import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        System.out.println("Enter whole number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
