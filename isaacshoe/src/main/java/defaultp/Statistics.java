package defaultp;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.*;

//standard deviation
//mean
//median
//quartiles
//r squared

public class Statistics 
{
	private double pmean;
	private double psd;
	private double pmedian;
	private double pmin;
	private double pq1;
	private double pq3;
	private double pmax;

	
	private double tmean;
	private double tsd;
	private double tmedian;
	private double tmin;
	private double tq1;
	private double tq3;
	private double tmax;

	

	private String PhosOnevarstatoutput;
	private String TurbOnevarstatoutput;
	
	
	ArrayList<Measurement> meas;
	
	public Statistics(ArrayList<Measurement> m)
	{
		meas = m;
	}
	
	public String oneVarPhos()
	{
		//for(int i=0; i<meas.size(); i++) {
		//System.out.print(meas.get(i).toString());}
		
		//Mean Calc
		pmean = 0;
		int i=0;
		for (i = 0; i < meas.size(); i++) {
			
			pmean = pmean + meas.get(i).getConductivity();
		}
		pmean=pmean/i;
		
		//Standard Deviation Calc
		psd = 0;
		i=0;
		for(i=0; i<meas.size(); i++) {
			psd=psd+Math.pow(Math.abs(pmean-meas.get(i).getConductivity()),2);
		}
		psd=Math.pow((psd/i), .5);
		
		//Median, minimum maximum calc
		double[] nums = new double[meas.size()];
		for(i=0; i<meas.size(); i++) {
			nums[i]=meas.get(i).getConductivity();
		}
		Arrays.sort(nums);
		pmin=nums[0];
		pmax=nums[nums.length-1];
		if(nums.length%2==0) {
			pq1=nums[(int)(nums.length*.25)];
			pq3=nums[(int)(nums.length*.75)];
			int y=(int)nums.length/2;
			pmedian=(nums[y]+nums[y+1])/2;
		}
		else {
			int y=(int)(nums.length/4);
			int x=(int)(nums.length*.75);
			pq1=(nums[y]+nums[y+1])/2;
			pq3=(nums[x]+nums[x+1])/2;
			pmedian=nums[nums.length/2];
		}
		//add up all values in array - mean squared, divide by the number of data points, take square root.
		//pmedian, pq1, pq3, min, and max require ordering the terms first and then use the indexes to determine
		//prsquared
		
		
		PhosOnevarstatoutput = ("Mean of conductivity data: " + pmean);
		PhosOnevarstatoutput += ("\nStandard Deviation of conductivity data: " + psd);
		PhosOnevarstatoutput += ("\nMedian of conductivity data: " + pmedian);
		PhosOnevarstatoutput += ("\n5 number summary of conductivity data: " + pmin + ", " + pq1 + ", " + pmedian + ", " + pq3 + ", "+ pmax);

		return PhosOnevarstatoutput;
	}
	
	public String oneVarTurb()
	{
		//mean calc
		tmean = 0;
		int i=0;
		for (i = 0; i < meas.size(); i++) {
			
			tmean = tmean + meas.get(i).getSalinity();
		}
		tmean=tmean/i;
		//Standard dev calc
		tsd = 0;
		i=0;
		for(i=0; i<meas.size(); i++) {
			tsd=tsd+Math.pow(Math.abs(tmean-meas.get(i).getSalinity()),2);
		}
		tsd=Math.pow((tsd/i), .5);
		//Median, minimum maximum calc
				double[] nums = new double[meas.size()];
				for(i=0; i<meas.size(); i++) {
					nums[i]=meas.get(i).getSalinity();
				}
				Arrays.sort(nums);
				tmin=nums[0];
				tmax=nums[nums.length-1];
				if(nums.length%2==0) {
					tq1=nums[(int)(nums.length*.25)];
					tq3=nums[(int)(nums.length*.75)];
					int y=(int)nums.length/2;
					tmedian=(nums[y]+nums[y+1])/2;
				}
				else {
					int y=(int)(nums.length/4);
					int x=(int)(nums.length*.75);
					tq1=(nums[y]+nums[y+1])/2;
					tq3=(nums[x]+nums[x+1])/2;
					tmedian=nums[nums.length/2];
				}
		TurbOnevarstatoutput = ("Mean of salinity data: " + tmean);
		TurbOnevarstatoutput += ("\nStandard Deviation of salinity data: " + tsd);
		TurbOnevarstatoutput += ("\nMedian of salinity data: " + tmedian);
		TurbOnevarstatoutput += ("\n5 number summary of salinity data: " + tmin + ", " + tq1 + ", " + tmedian + ", " + tq3 + ", "+ tmax);
		return TurbOnevarstatoutput;
	}

}