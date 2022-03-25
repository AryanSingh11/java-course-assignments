package Arrays.VideoQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]ros=new int[3];

        for (int i = 0; i < ros.length; i++) {
            ros[i]=in.nextInt();
        }

//        for(int fgh : ros){
//            System.out.print(fgh);
//        }

        System.out.println(Arrays.toString(ros));
    }
}
