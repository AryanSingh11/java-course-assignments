package OOPS.PartOne;

public class WrapperExample {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        //Integer num = new Integer(34);

        swap(23,54);

        System.out.println(a);
        System.out.println(b);

        final int fui= 89;
        //fui = 56;

    }

    static void swap(int a , int b){
        int temp = a;
        a=b;
        b= temp;

        System.out.println(a);
        System.out.println(b);




    }
}
