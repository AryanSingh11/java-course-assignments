package Arrays.BinarySearch;

public class ceilingPractise {
    public static void main(String[] args) {
        int[]arr={12,14,15,18,22,34,56,78,89};
        int target=40;

        System.out.println(ceiling(arr, target));
    }
    public static int ceiling(int[]arr, int target){
        int start=0;
        int end= arr.length-1;

        boolean isAsc=   arr[start]<arr[end];



        while(start<=end){
//
            int  mid=start+(end-start)/2;

            if(target==arr[mid]){
             return mid;
           }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }
        return start;
        //return end;
    }
}

















