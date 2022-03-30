package Arrays.VideoQuestions;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]Arr=new int[5];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]=in.nextInt();
        }
        System.out.println("Enter the No. you want to search");
        int y=in.nextInt();

        System.out.println(linearSearching(y, Arr));
    }


    static int linearSearching(int x, int[]arr){
        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==x){
                return ans= i;
            }

            if(arr.length==0){
                return ans= -1;
            }
        }
        //if no return statement is hit then this will be  executed
        return -1;
    }

}
