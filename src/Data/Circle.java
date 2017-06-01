package Data;
import Interfaces.Shape;
public class Circle implements Shape{

	private double r;
	
	public double getR(){
		return this.r;
	}
	
	public void setR(double r){
		this.r = r;
	}
	
	public Circle(double r){
		setR(r);
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return PI * (r*r);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * PI * r;
	}

}
