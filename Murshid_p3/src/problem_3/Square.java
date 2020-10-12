package problem_3;

public class Square extends Shape2D
{


	private double length;


	public Square(double i) 
	{
		this.length = i; 
	}


	protected String getName() 
	{
		
		return "square";
	}

	
	protected Double getArea() 
	{
		double area = this.length*this.length;
		return area;
		
	}
	
	/*
	protected Double getlength()
	{
		return this.length; 
	}
	
	protected void setlength(int a)
	{
		this.length = a; 
		
	}
	*/
	
}
