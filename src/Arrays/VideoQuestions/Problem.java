package Arrays.VideoQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();

        String s="";
        while(x>=0){

            s=in.nextLine();
            proString(s);
            x--;
            System.out.println();

        }
        //proString(s);
        //String s1=in.nextLine();
        //String s2=in.nextLine();
        //proString(s1);
        //proString(s2);
    }
    static void proString(String s){
        String str=s;
        char[]c=new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            c[i]=str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                System.out.print(c[i]);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                System.out.print(c[i]);
            }
        }

       // System.out.println(Arrays.toString(c));
    }



}
