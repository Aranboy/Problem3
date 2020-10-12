package problem_3;

public class Triangle extends Shape2D 
{
	
	private double height;
	private double base;

	public Triangle(double i, double j) 
	{
		this.base = i;
		this.height = j;
	}

	public Triangle() 
	{
	
	}


	protected String getName() 
	{
		return "triangle";
	}

	

	protected Double getArea() 
	{
		double area = (this.base*this.height)/2;
		return area;
	}



}
