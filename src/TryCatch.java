import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class TryCatch {

        public static void main(String[] args)throws IOException {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number");
            int num=0;
            try {
                num = Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){

                System.out.println("Please enter a integer data");
                num=Integer.parseInt(br.readLine());

            }
            System.out.println("Num: "+num);

    }
}
