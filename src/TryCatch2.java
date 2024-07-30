import java.security.spec.ECField;

public class TryCatch2 {

    void m1(){

        System.out.println("In m1");
    }
    public static void main(String[] args) {

        TryCatch2 obj=new TryCatch2();
        obj=null;
        try{
            obj.m1();

        }
//        catch(ArithmeticException | Exception e)... parent class not allowed
        catch( ArithmeticException | NullPointerException  e){

            System.out.println("NullPointer Exception");
        }
    }
}
