
import java.util.Scanner;

public class Throw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();

        try {
            if (x == 0) {
                throw new ArithmeticException("Divide by zero");
            }
            System.out.println(10 / x);

        } catch (ArithmeticException ae) {

            System.out.println("Exception in thread " + Thread.currentThread().getName() + " ");
            ae.printStackTrace();
        }
    }
}
