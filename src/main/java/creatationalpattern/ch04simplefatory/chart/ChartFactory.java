package creatationalpattern.ch04simplefatory.chart;

/**
 * @author : Cory Jia on 11/24/19
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;

        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("Initializing histogram chart!");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("Initializing pie chart!");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("Initializing line chart!");
        }
        return chart;
    }
}
