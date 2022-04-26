package Strings.VideoQues;


//to tell wether a and b are pointing to the same object or not

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        String a="Aryan";
        String b="Aryan";

        int []arr= new int[56];

        String name1=new String("Aryan");
        String name2= new String("Aryan");

        //== tellls if pointing to same object
        System.out.println(name1==name2);

        //dot equals tells if value of object is same
        System.out.println(name1.equals(name2));


        String c=a;
       System.out.println(a==c);

        System.out.println(Arrays.toString(new int[]{3, 4, 5, 6, 7}));

        String name= null;
        System.out.println(name);

    }
}
