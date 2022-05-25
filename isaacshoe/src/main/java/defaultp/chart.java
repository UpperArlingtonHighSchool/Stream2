package defaultp;

//based on:
//https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm
//Written by Isaac L
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
//Instantiate Chart
 public chart( String applicationTitle, String chartTitle, ArrayList<Measurement> m) {
    super(applicationTitle);
  //Set up xyline chart for Salinity and Conductivity
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
       chartTitle ,
       "Salinity (PSU)" ,
       "Conductivity (uS/cm)" ,
       createDataset(m) ,
       PlotOrientation.VERTICAL ,
       true , true , false);
     //Sets up design and dimensions of line graph  
    ChartPanel chartPanel = new ChartPanel( xylineChart );
    chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
    final XYPlot plot = xylineChart.getXYPlot( );
    
  //Creates line
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
    renderer.setSeriesPaint( 0 , Color.RED );
   
  //Defines Stroke
    renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
  //Renders line
    plot.setRenderer( renderer ); 
  //Defines panel
    setContentPane( chartPanel ); 
 }
 //Iterate through Measurement and get the salinity and conductivity at each point
 private XYDataset createDataset(ArrayList<Measurement> m) {
   //Create XYSeries that stores data
    final XYSeries compare = new XYSeries( "Compare" );     
    for(Measurement meas : m)
  	  compare.add( meas.getSalinity() , meas.getConductivity() );   
  //Collection has 1 XYSeries as there is only one comparison being made
    final XYSeriesCollection dataset = new XYSeriesCollection( );          
    dataset.addSeries( compare );          

    return dataset;
 }
}
