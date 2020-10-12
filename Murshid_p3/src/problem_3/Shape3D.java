package problem_3;

public abstract class Shape3D extends Shape2D
{

	protected abstract double getVolume();

	//protected double a; Public, any class can access. Protected = child can use. Private = only object can use 
}
