package Data;
import Interfaces.Shape;

public class Rectangle implements Shape{

	private double a;
	
	public double getA(){
		return this.a;
	}
	
	public void setA(double a){
		this.a = a;
	}
	
	public Rectangle(double a){
		setA(a);
	}
	
	
	
	@Override
	public double calculateArea() {
		return a*a;
	}

	@Override
	public double calculatePerimeter() {
		return a*4;
	}

}
