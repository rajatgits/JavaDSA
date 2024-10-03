public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while (s<=e) {
            int mid = s + (e-s)/2;

            if(arr[mid] == target) {
                return mid+1;
            } else if (arr[mid]<target) {
                s = mid+1;
            }else {
                e = mid-1;
            }
        }
        return -1;
    }
}
