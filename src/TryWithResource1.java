import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource1 {

    public static void main(String[] args)throws IOException {

        BufferedReader br=null;

        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter number");
            int num=Integer.parseInt(br.readLine());

        }finally{

            br.close();
            System.out.println("Resource closed");
        }
    }
}
