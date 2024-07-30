import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter numerator");
        int num=sc.nextInt();

        System.out.println("Enter Denominator");
        int deno= sc.nextInt();

        int div=0;
        try {
            div = num / deno;

        }catch(ArithmeticException e) {

            System.out.println("Denominator cannot be zero");
            System.out.println("Enter num other than zero");
            deno=sc.nextInt();
            div = num / deno;

        }
        finally{
            System.out.println("Division: "+div);
            System.out.println("Connection closed");
        }

    }
}
