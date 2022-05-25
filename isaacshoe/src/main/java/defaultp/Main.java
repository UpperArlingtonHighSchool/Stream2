package defaultp;

//Dylan T
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.ui.RefineryUtilities;
import com.company.GUIRunner;

import defaultp.Measurement;
import defaultp.Statistics;

public class Main {
	static //ArrayList to store Measurements
			ArrayList<Measurement> m = new ArrayList<Measurement>();
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		
		//File of Measurements
		File file = new File("src/main/java/AllTheDataCorrected.txt");
		Scanner reader = new Scanner(file);
		
		//Goes through file and creates Measurement object
		while(reader.hasNext())
		{
			String s = reader.nextLine();
			m.add(new Measurement(s));
		}
		
		//Calculates one-var and two-var statistics
		Statistics s = new Statistics(m);
		
		
		//GUI Runner
		GUIRunner pop = new GUIRunner();
		
		
		//Set up char
	}
	public static void Chort() {
		chart c = new chart("Stream Study - Table 2","Salinity vs Conductivity", m);
		c.pack( );          
		RefineryUtilities.centerFrameOnScreen( c );
		c.setVisible(true); 
	}
}
