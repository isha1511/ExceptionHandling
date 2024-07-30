public class NullPointerExcp {

    void m1(){

        System.out.println("In method m1");
    }

    void m2(){

        System.out.println("In method m2");
    }
    public static void main(String[] args) {

        System.out.println("Start");

        NullPointerExcp obj=new NullPointerExcp();
        obj.m1();
        obj=null;
        obj.m2();

    }
}
