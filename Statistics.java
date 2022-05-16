import java.util.ArrayList;

//standard deviation
//mean
//median
//quartiles
//r squared

public class Statistics 
{
	private int pmean;
	private int psd;
	private int pmedian;
	private int pmin;
	private int pq1;
	private int pq3;
	private int pmax;
	private int prsqrd;
	
	private int tmean;
	private int tsd;
	private int tmedian;
	private int tmin;
	private int tq1;
	private int tq3;
	private int tmax;
	private int trsqrd;
	
	
/*	
	private int twomean;
	private int twosd;
	private int twomedian;
	private int twomin;
	private int twoq1;
	private int twoq3;
	private int twomax;
	private int twosqrd;

	private String Twovarstatoutput;
	
*/	
	private String PhosOnevarstatoutput;
	private String TurbOnevarstatoutput;
	
	
	ArrayList<Measurement> meas;
	
	public Statistics(ArrayList<Measurement> m)
	{
		meas = m;
	}
	
	public String oneVarPhos()
	{
		PhosOnevarstatoutput = ("Mean of Phosphate data: " + pmean);
		PhosOnevarstatoutput += ("\nStandard Deviation of phosphate data: " + psd);
		PhosOnevarstatoutput += ("\nMedian of phosphate data: " + pmean);
		PhosOnevarstatoutput += ("\n5 number summary of phosphate data: " + pmin + ", " + pq1 + ", " + pmedian + ", " + pq3 + ", "+ pmax);
		PhosOnevarstatoutput += ("\nCoefficient of determination (r squared) for phosphate data: " + prsqrd);
		return PhosOnevarstatoutput;
	}
	
	public String oneVarTurb()
	{
		TurbOnevarstatoutput = ("Mean of turbidity data: " + tmean);
		TurbOnevarstatoutput += ("\nStandard Deviation of turbidity data: " + tsd);
		TurbOnevarstatoutput += ("\nMedian of turbidity data: " + tmean);
		TurbOnevarstatoutput += ("\n5 number summary of turbidity data: " + tmin + ", " + tq1 + ", " + tmedian + ", " + tq3 + ", "+ tmax);
		TurbOnevarstatoutput += ("\nCoefficient of determination (r squared) for turbidity data: " + trsqrd);
		return TurbOnevarstatoutput;
	}
	public String twoVar() {
		
		return null;
	}
}
