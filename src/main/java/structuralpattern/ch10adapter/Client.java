package structuralpattern.ch10adapter;

import java.util.Arrays;

/**
 * @author coryjia@gmail.com
 * @date 4/7/20 4:28 PM
 */
public class Client {
    public static void main(String[] args) {
        ScoreOperation operation = new OperatorAdapter();
        int[] scores = {84,76,50,69,90,91,88,96};

        System.out.println("Sort the score");
        int[] res = operation.sort(scores);

        System.out.println(Arrays.toString(res));

        System.out.println("Search 90 score");
        System.out.println(operation.search(res, 90) == 1 ? "Find" : "Score does not exist.");
    }
}
