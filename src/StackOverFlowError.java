public class StackOverFlowError {

    public static void fun(int x){

        System.out.println(x);
        fun(++x);
    }
    public static void main(String[] args) {

        fun(1);
    }
}
