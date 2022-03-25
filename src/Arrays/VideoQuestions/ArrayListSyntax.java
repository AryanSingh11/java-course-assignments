package Arrays.VideoQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSyntax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(56);
        list.add(78);

        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

    }
}
