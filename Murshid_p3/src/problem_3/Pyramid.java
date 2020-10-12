package problem_3;

public class Pyramid extends Shape3D 
{

	
	private double height;
	private double width;
	private double length;


	public Pyramid(double i, double j, double k) 
	{
		this.length = i;
		this.width = j; 
		this.height = k; 
		
	}


	public Pyramid() 
	{
		
	}


	protected String getName() 
	{
		return "pyramid";
	}

	
	protected Double getArea() 
	{
		double area = (this.length*this.width)+this.length*(Math.sqrt(((this.width/2)*(this.width/2))+(this.height*this.height)))+this.width*(Math.sqrt(((this.length/2)*(this.length/2))+(this.height*this.height))); 
		return area;
	}


	
	protected double getVolume() 
	{
		double vol = (this.length*this.width*this.height)/3; 
		return vol;
	}




	}


