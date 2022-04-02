package Arrays.BinarySearch;

//link to problem is https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        int[]letters={'c','f','j'};
        int target='f';

        System.out.println(CeilingOfNum(letters,  target));
    }
    static int CeilingOfNum(int[]letters, int target){



        int  start=0;
        int end= letters.length-1;


        while(start<=end){
            int mid= start+(end-start)/2;


                if(target<letters[mid]){
                    end=mid-1;
                }else if(target>letters[mid]){
                    start=mid+1;
                }

        }

        return letters[start%(letters.length)];
    }
}
