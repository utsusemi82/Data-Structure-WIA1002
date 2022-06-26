/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class DemoChart extends ApplicationFrame {

    public DemoChart(String s)
    {
        super(s);
        JPanel jpanel = createDemoPanel();
        jpanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(jpanel);
    }

    private static CategoryDataset createDataset()
    {
        String s1 = "First";
        String s2 = "Second";
        String s3 = "Third";
        String s4 = "Forth";
        String s5 = "Fivth";
        String s6 = "Sixth";
        String s7 = "Seventh";
        String s8 = "Eighth";
        String s9 = "Ninth";
        String s10 = "Tenth";

        DefaultCategoryDataset defaultcategorydataset = new DefaultCategoryDataset();
        int count = 5;
        int value = 0;
        //String keyRow="s";

        for (int i=1;i<=8;i++){
            value = i*4;
            Comparable colKey = 0;
            String keyRow = "s"+i;
            for(int j=1;j<=count;j++){
            colKey = j;
                defaultcategorydataset.addValue(value, keyRow, colKey);
            }
        }
return defaultcategorydataset;
    }

    public static JFreeChart createChart1(CategoryDataset categorydataset,double d) {
        Color bckColor1 = Color.decode("#4282CE"); //Light blue
        Paint p = new GradientPaint(0, 1, bckColor1, 0, 1, bckColor1);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(35.0, "S1", "u");
        dataset.addValue(45.0, "S1", "r");
        dataset.addValue(2.0, "S1", "b");
        dataset.addValue(75.0, "S1", "t");
        dataset.addValue(25.0, "S1", "l");
        dataset.addValue(95.0, "S1", "bla");
        dataset.addValue(15.0, "S1", "bla");
        dataset.addValue(45.0, "S1", "bla");
        SpiderWebPlot plot = new SpiderWebPlot(dataset);
        JFreeChart chart = new JFreeChart(plot);
        boolean success = false;
        try {
            BufferedImage image = new BufferedImage(200 , 100, 
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
            g2.dispose();
            success = true;
        }
        catch (Exception e) {
            success = false;
        }
        return chart;
    }

    public static JPanel createDemoPanel()
    {
        JFreeChart jfreechart = createChart1(createDataset(), 10D);
        return new ChartPanel(jfreechart);
    }

    public static void main(String args[])
    {
        DemoChart spiderwebchartdemo1 = new DemoChart("JFreeChart: SpiderWebChartDemo1.java");
        spiderwebchartdemo1.pack();
        spiderwebchartdemo1.setVisible(true);
    }
}