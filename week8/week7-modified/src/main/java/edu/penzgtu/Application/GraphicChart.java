package edu.penzgtu.Application;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;

public class GraphicChart {
     public static ArrayList<Character> generateParenthesis(int n) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add('{'); list.add('}');
        }
        return list;
    }

    public static void outGraphicChart() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        dataset.addSeries("Series", getCoordinates(10000, 1000000));

        // Create graph
        JFreeChart chart = ChartFactory.createScatterPlot(
                "O(n)",
                "n",
                "time",
                dataset);
        // Window graph
        ChartFrame frame = new ChartFrame("Visualisation", chart);
        frame.pack();
        frame.setVisible(true);
    }

    private static double[][] getCoordinates(int step, int end) {
        double[][] coordinates = new double[2][end/step];
        int ind = 0;
        for (int i = 0; i < end;) {
            ArrayList<Character> list = generateParenthesis(i);
            long time = System.nanoTime();
            ValidParentheses.isValid(list);
            coordinates[0][ind] = i;
            coordinates[1][ind] = System.nanoTime() - time;
            i += step;
            ind += 1;
        }
        return coordinates;
    }
}
