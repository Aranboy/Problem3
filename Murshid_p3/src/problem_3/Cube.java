package problem_3;

public class Cube extends Shape3D 
{

	
	private double length;


	public Cube(double i) 
	{
		this.length = i; 
	}


	public Cube() 
	{
		
	}


	protected String getName() 
	{
		return "cube";
	}

	
	protected Double getArea() 
	{
		double area = 6 * (this.length*this.length);
		
		return area;
	}


	protected double getVolume() 
	{
		double vol = (this.length*this.length*this.length);//math.pow
		return vol;
	}

}
