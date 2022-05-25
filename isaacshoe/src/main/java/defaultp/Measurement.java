package defaultp;


public class Measurement 
{
	//location 0
	//year 1
	//salinity 7
	//conductivity 6
	
	private String location;
	private int year;
	private double salinity;
	private double conductivty;
	
	
	public Measurement(String s)
	{
		String[] split = s.split(" ");
		location = split[0];
		year = Integer.parseInt(split[1]);
		salinity = Double.parseDouble(split[7]);
		conductivty = Double.parseDouble(split[6]);
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String l)
	{
		location = l;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public double getSalinity()
	{
		return salinity;
	}
	
	public void setSalinity(double p)
	{
		salinity = p;
	}
	
	public double getConductivity()
	{
		return conductivty;
	}
	
	public void setConductivity(double t)
	{
		conductivty = t;
	}
}
