package Arrays.BinarySearch;

public class Ceiling {
    //smallest number greater than equal to target
    public static void main(String[] args) {
        int[]arr={2,4,6,9,11,14,16,19};
        int target=133;

        System.out.println(CeilingOfNum(arr,  target));
    }
    static int CeilingOfNum(int[]arr, int target){

        if(target>arr[arr.length-1]){
            return -1;
        }

        int  start=0;
        int end= arr.length-1;
        int outSide=0;

        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
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
            outSide=start;
        }

        return arr[outSide];
    }
}
