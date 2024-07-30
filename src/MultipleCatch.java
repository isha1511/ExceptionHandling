public class MultipleCatch {

    public static void main(String[] args) {

        System.out.println("Start main");

        try{
            int arr[]=new int[5];

            int div=10/0;
            System.out.println(arr[10]);

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("ArrayIndexOutOfBoundsException occured");

        }catch(ArithmeticException e){

            System.out.println("ArithmeticException Occured");

        }catch(Exception e){

            System.out.println("Parent Exception");
        }

        System.out.println("End main");
    }
}
