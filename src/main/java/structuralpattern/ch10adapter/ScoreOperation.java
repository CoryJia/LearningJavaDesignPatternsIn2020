package structuralpattern.ch10adapter;

/**
 * @author coryjia@gmail.com
 * @date 4/7/20 4:13 PM
 * 抽象成绩操作类：目标接口
 */
public interface ScoreOperation {
    public int[] sort(int[] arr);

    public int search(int[] arr, int key);
}
