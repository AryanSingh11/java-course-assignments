package Recursion.easy;

import java.util.ArrayList;

//given an array with repeated targets
//find all the indexes where it repeats and print them

public class FindAllIndex {
    public static void main(String[] args) {
        int []arr={1,2,3,4,4,4,4,8,9};
        FindAllIndex(arr, 4, 0);
        System.out.println(list.toString());
        //findAllIndexArrayList(arr, 4, 0, list);
        ArrayList<Integer> ans = findAllIndexArrayList(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllIndexArrayList2(arr, 4, 0));

    }

    //idea is to create an arraylist and add the index to it whenever a target is found
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int []arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }

        FindAllIndex(arr, target, index+1);
    }

    //what if you wanted arraylist as a return type
    static ArrayList findAllIndexArrayList(int[]arr, int target,int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }

        return findAllIndexArrayList(arr, target, index+1, list);
    }

    //what if you couldn't use Arraylist object as a parameter
    //below is  a solution to exactly that

    static ArrayList<Integer> findAllIndexArrayList2(int[]arr, int target,int index){
        //every time a new arraylist object is created
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer>ansFromBelowCalls = findAllIndexArrayList2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
