package Recursion.easy;

public class FindIndex {
    public static void main(String[] args) {
        int []arr= {1,2,3,18,9};
        //int []arr2= {1,2,3,18,18,9};
        int target = 18;
        System.out.println(Index(arr, target, 0));
        System.out.println(FindIndex(arr, target, 0));

        //what if there was a question where elements were repeated
        //and you had to find out the last index the element occured
        //simply
        System.out.println(FindIndexFromEnd(arr, target, arr.length-1));
    }

    //this just verifies if a particular element is present in the array or not using recursion
    //returns true or false if the element is present or not
    static boolean Index(int []arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index]==target || Index(arr, target, index+1);
    }

    //this one finds the index and returns it
    static int FindIndex(int []arr, int target, int Index){
        if(Index==arr.length){
            return -1;
        }

        if(arr[Index]==target){
            return  Index;
        }else{
            return FindIndex(arr, target, Index+1);
        }
    }

    //finds index from the end of the Array
    static int FindIndexFromEnd(int []arr, int target, int Index){
        if(Index== -1){
            return -1;
        }

        if(arr[Index]==target){
            return  Index;
        }else{
            return FindIndex(arr, target, Index-1);
        }
    }
}
