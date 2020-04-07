package structuralpattern.ch10adapter;

/**
 * @author coryjia@gmail.com
 * @date 4/7/20 4:25 PM
 * 操作适配器：适配器
 */
public class OperatorAdapter implements ScoreOperation{
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperatorAdapter() {
        this.sortObj = new QuickSort();
        this.searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] arr) {
        return sortObj.quickSort(arr);
    }

    @Override
    public int search(int[] arr, int key) {
        return searchObj.binarySearch(arr, key);
    }
}
