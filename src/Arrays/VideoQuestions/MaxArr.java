package Arrays.VideoQuestions;

//we initially calculated for full array then we programmed it for a range inside array
public class MaxArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,7,5,12,24,47};
        System.out.println(maxArr(arr, 1,6));
    }

    public static int maxArr(int[]krr, int startRange, int endRange){
        int max=krr[startRange];
        for (int i = startRange+1; i <=endRange; i++) {
            if(krr[i]>max){
                max=krr[i];
            }
        }
        return max;
    }

}
