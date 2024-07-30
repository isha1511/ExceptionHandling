import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource2 {

    public static void main(String[] args)throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter number");
            int num = Integer.parseInt(br.readLine());

            System.out.println("Num" + num);
            System.out.println("Resource closed");

        }catch(NumberFormatException e){
                System.out.println("Invalid Input");

        }
    }
}
