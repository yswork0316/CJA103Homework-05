package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setdepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea(){
		return width * depth;
	}
	
	public MyRectangle() {}
	public MyRectangle(double width, double depth) {
		setWidth(width);
		setdepth(depth);
	}
}
