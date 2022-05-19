
//https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.BasicStroke; 

import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class chart extends ApplicationFrame {

 public chart( String applicationTitle, String chartTitle, ArrayList<Measurement> m) {
    super(applicationTitle);
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
       chartTitle ,
       "Phosphate (MgL)" ,
       "Turbidity (NTU)" ,
       createDataset(m) ,
       PlotOrientation.VERTICAL ,
       true , true , false);
       
    ChartPanel chartPanel = new ChartPanel( xylineChart );
    chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
    final XYPlot plot = xylineChart.getXYPlot( );
    
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
    renderer.setSeriesPaint( 0 , Color.RED );
   
    renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
    plot.setRenderer( renderer ); 
    setContentPane( chartPanel ); 
 }
 
 private XYDataset createDataset(ArrayList<Measurement> m) {
    final XYSeries compare = new XYSeries( "Compare" );     
    for(Measurement meas : m)
  	  compare.add( meas.getPhosphate() , meas.getTurbitity() );               
    final XYSeriesCollection dataset = new XYSeriesCollection( );          
    dataset.addSeries( compare );          

    return dataset;
 }
}
