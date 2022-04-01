package Arrays.BinarySearch;

public class Floor {
    //biggest number smaller than equal to target
    public static void main(String[] args) {
        int[]arr={2,4,6,9,11,14,16,19};
        int target=13;

        System.out.println(FloorOfNum(arr,  target));
    }
    static int FloorOfNum(int[]arr, int target){


        int  start=0;
        int end= arr.length-1;
        //int outSide=0;

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
            //outSide=end;

        }
        return arr[end];

    }
}
