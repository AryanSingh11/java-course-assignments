package Arrays.VideoQuestions;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //you are given a String, you need to find the char inside it
        //and return the index
        String s="aryan";
        char target='y';
        char[]sArr=s.toCharArray();

        char cc=in.next().trim().charAt(0);
        searchString(cc,sArr);

    }

    static void searchString(char ss, char[]CC){
        for (int i = 0; i <CC.length ; i++) {
            if(CC[i]==ss){
                System.out.println(i);
            }


        }

    }
}
