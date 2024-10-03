import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 8, 7, 10};
        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int l, int h) {
        if(l>=h){
            return;
        }

        int s = l;
        int e = h;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while (s<=e) {
            while (arr[s]<pivot) {
                s++;
            }

            while (arr[e]>pivot) {
                e--;
            }

            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, l, e);
        quickSort(arr, s, h);
    }
}
