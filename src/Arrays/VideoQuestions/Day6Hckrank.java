package Arrays.VideoQuestions;

import java.util.Scanner;

public class Day6Hckrank {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        in.nextLine();

        for (int i = 0; i < x; i++) {
            String s= in.nextLine();
            char[]ch=s.toCharArray();


            for (int j = 0; j < ch.length; j++) {

                    if(j%2==0){
                        System.out.print(ch[i]);
                    }

                System.out.print(" ");

                    if(i%2!=0){
                        System.out.print(ch[i]);
                    }
            }
            System.out.println();
        }
        in.close();
    }
}
