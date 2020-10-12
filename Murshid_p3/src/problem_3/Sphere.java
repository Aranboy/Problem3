package problem_3;

public class Sphere extends Shape3D 
{

	
	private double radius;
	 

	public Sphere(double i) 
	{
		this.radius = i; 
	}


	public Sphere() 
	{
		
	}


	protected String getName()
	{
		return "sphere";
	}

	
	protected Double getArea() 
	{
		double area = 4*(3.1416)*(this.radius*this.radius);		
		return area;
	}


	
	protected double getVolume() 
	{	
		double vol = (4.0/3)*(pi)*(this.radius*this.radius*this.radius); 
		
		return vol;
	}

}
