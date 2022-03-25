package Arrays.VideoQuestions;

import java.util.Arrays;

public class PassingInfunction {
    public static void main(String[] args) {
            int[]ghk={23,34, 65 ,70,32};
        System.out.println(Arrays.toString(ghk));
            change(ghk);
        System.out.println(Arrays.toString(ghk));

    }

    static void change(int []arr){
        arr[1]=90;
    }
}
