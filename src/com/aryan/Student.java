package com.aryan;

//creating  a class
 class  Student{

    //creating fields
    int id;
    String name;

    void insertRecord(int r,String s){
        id=r;
        name=s;
    }




   public static class TestStudent{

            public static void main(String args[]){
                Student s1= new Student();
                Student s2=new Student();

                s1.insertRecord(11,"Aryan");
                s2.insertRecord(123, "Singh");

                System.out.println(s1.id);
                System.out.println(s1.name);

                System.out.println(s2.id);
                System.out.println(s2.name);
            }

    }

}





