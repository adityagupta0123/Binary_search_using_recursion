package Recursion;

public class BS {
    public static void main(String[] args) {
        int []arr = {1,2,55,66,67,89};
        int target = 89;

        System.out.println(search(arr, target, 0, arr.length-1));
    }
    private static int search(int []arr,int target, int s, int e){
        if (s>e){
            System.out.println("invalid start and end");
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m] == target)
            return m; // return target index
        if (target < arr[m])
            return search( arr, target, s, m-1 );
        return search(arr, target, m+1, e);
    }
}
