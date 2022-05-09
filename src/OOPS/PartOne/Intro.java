package OOPS.PartOne;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int[] numbers= new int[5];

        String[] names = new String[5];

        //data with roll no, names and Marks

//        int[]rno=new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
//  datatype for every single student

        class Student{
            int rno;
            String name;
            float marks=67;

            Student(){
                this.rno=34;
                this.name="Aloo";
                this.marks= 76;
            }
            Student(int rno, String name, float marks){
                this.rno=rno;
                this.name= name;
                this.marks=marks;
            }
        }

            Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));




        Student aryan = new Student(55, "sachin", 67f);

//        aryan.rno=32;
//        aryan.name="Aryan";
        //aryan.marks=  89.7f;

        System.out.println(aryan.rno);
        System.out.println(aryan.name);
        System.out.println(aryan.marks);

        Student one = new Student();
        Student two = one;

        one.name="BHINDI";
        System.out.println(two.name);


    }
}

















