package structuralpattern.ch10adapter;

/**
 * @author coryjia@gmail.com
 * @date 4/7/20 4:22 PM
 * 二分查找类：适配者
 */
public class BinarySearch {
    public int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) /2;
            int midVal = arr[mid];

            if (midVal < key){
                low = mid + 1;
            }else if(midVal > key){
                high = mid - 1;
            }else {
                return 1; //find key
            }
        }

        return -1; //key does not exist
    }
}
