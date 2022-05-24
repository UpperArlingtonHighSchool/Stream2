//Dylan T
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.ui.RefineryUtilities;

public class Main {

	public static void main(String[] args) throws FileNotFoundException 
	{
		//ArrayList to store Measurements
		ArrayList<Measurement> m = new ArrayList<Measurement>();
		
		//File of Measurements
		File file = new File("src/AllTheDataCorrected.txt");
		Scanner reader = new Scanner(file);
		
		//Goes through file and creates Measurement object
		while(reader.hasNext())
		{
			String s = reader.nextLine();
			m.add(new Measurement(s));
		}
		
		//Calculates one-var and two-var statistics
		Statistics s = new Statistics(m);
		
		//Creates chart comparing Salinity vs Conductivity and passes in the data
		chart c = new chart("Stream Study - Table 2","Salinity vs Conductivity", m);
      			c.pack( );          
      			RefineryUtilities.centerFrameOnScreen( c );          
      			c.setVisible( true ); 
	}

}
