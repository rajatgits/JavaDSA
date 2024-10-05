package array;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1,2 ,5 , 7 , 8, 9, 10, 15};
        int target = 15;
        System.out.println(searchArray(arr, target, 0));
    }

    static boolean searchArray(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || searchArray(arr, target, index+1);
    }
}
