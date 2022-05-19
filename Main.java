import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
		
		Statistics s = new Statistics(m);
		
		
	}

}
