package creatationalpattern.ch04simplefatory.chart;

import creatationalpattern.ch04simplefatory.XMLUtil;

/**
 * @author : Cory Jia on 11/24/19
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("Histogram");
        chart.display();

        String type = XMLUtil.getType("chartconfig.xml");
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
