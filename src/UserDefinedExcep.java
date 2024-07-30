import java.util.Scanner;
class DataOverFlowException extends RuntimeException{

    DataOverFlowException(String msg){

        super(msg);
    }
}
class DataUnderFlowException extends RuntimeException{

    DataUnderFlowException(String msg){

        super(msg);
    }
}

class ArrayDemo {

    public static void main(String[] args) {

        int[] arr=new int[10];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter integer value. Note 0<element <100");

        for(int i=0;i<arr.length;i++){

            int data=sc.nextInt();
            if(data>100){

                throw new DataOverFlowException("Data must be less than 100");

            }else if(data <0){

                throw new DataUnderFlowException("Data must be greater than 0");
            }
            arr[i]=data;
        }

        for(int x:arr){

            System.out.println(x);
        }
    }
}
