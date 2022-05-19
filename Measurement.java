
public class Measurement 
{
	//location 0
	//year 1
	//phosphate LAST
	//turbitity 3
	
	private String location;
	private int year;
	private double phosphate;
	private double turbitity;
	
	
	public Measurement(String s)
	{
		String[] split = s.split(" ");
		location = split[0];
		year = Integer.parseInt(split[1]);
		phosphate = Double.parseDouble(split[split.length-1]);
		turbitity = Double.parseDouble(split[3]);
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
	
	public double getPhosphate()
	{
		return phosphate;
	}
	
	public void setPhosphate(double p)
	{
		phosphate = p;
	}
	
	public double getTurbitity()
	{
		return turbitity;
	}
	
	public void setTurbitity(double t)
	{
		turbitity = t;
	}
}
