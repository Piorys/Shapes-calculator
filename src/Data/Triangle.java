package Data;
import Interfaces.Shape;
public class Triangle implements Shape{
	
	private double a;
	private double h;
	
	public double getA(){
		return this.a;
	}
	
	public void setA(double a){
		this.a = a;
	}
	
	public double getH(){
		return this.h;
	}
	
	public void setH(double h){
		this.h = h;
	}
	
	public Triangle (double a,double h){
		setA(a);
		setH(h);
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return a*h/2;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return a*3;
	}

}
