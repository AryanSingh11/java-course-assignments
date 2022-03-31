package Arrays.BinarySearch;

public class FirstBinarySearch {
    public static void main(String[] args) {
        int []arr={0, 2,4,9,11,14,16,19,24};
        int target=9;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[]Arr, int target){
        int start=0;
        int end=Arr.length-1;

        while(start<=end){
            int mid= start+((end-start)/2);

            if(target<Arr[mid]){
                end=mid-1;
            }else if(target>Arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
