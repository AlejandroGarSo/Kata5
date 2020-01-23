package kata5.view;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import kata5.model.*;

public class HistogramDisplay extends ApplicationFrame{

    private Histogram histogram;
    public HistogramDisplay(Histogram histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset()));  
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
    
    public void execute(){
    this.show();
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = 
                ChartFactory.createBarChart3D(
                        "Histograma JFreeChart",
                        "Dominios eMails",
                        "Nº eMails",
                        dataset,
                        PlotOrientation.VERTICAL,
                        false,
                        false,
                        rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Object key : this.histogram.ketSet()) {
            dataset.addValue(this.histogram.get(key),"",key.toString());
        }
        return dataset;
    }
   
    
}
