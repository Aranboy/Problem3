package problem_3;

public class Circle extends Shape2D 
{


	private double radius;
	//private double radius;

	public Circle(int i) 
	{
		this.radius = i; 
	}

	public Circle() 
	{
		
	}

	public Circle(double d) 
	{
		this.radius = d; 
	}

	protected String getName() 
	{
		return "circle";
	}

	protected Double getArea() 
	{
		//Shape shape = new Square(2);  
		//shape.length = 2
		//shape.setlength 
		
		double area = (3.1416)*(this.radius*this.radius); 
		return area;
	}
}
