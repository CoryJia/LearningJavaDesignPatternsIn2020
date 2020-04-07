package structuralpattern.ch10adapter;

/**
 * @author coryjia@gmail.com
 * @date 4/7/20 4:14 PM
 * 快速排序类：适配者
 */
public class QuickSort {
    public int[] quickSort(int[] arr){
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(int[] arr, int left, int right) {
        int mid = 0;
        if (left < right){
            mid = partition(arr, left, right);
            sort(arr, left, mid - 1);
            sort(arr, mid + 1, right);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int j = start - 1;
        for (int i = start; i <= end - 1; i++) {
            if (arr[i] <= pivot){
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, j + 1, end);
        return j + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
