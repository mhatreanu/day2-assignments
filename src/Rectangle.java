public class Rectangle{
	
	private double length;
	private double breadth;

	Rectangle(){}
	Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;		
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}

	public double area()
	{
		return length*breadth;
	}

	public void compareArea(Rectangle r1, Rectangle r2)
	{
		if(r1.area() == r2.area())
			System.out.println("Areas of both rectangles is same");
		else
			System.out.println("Areas of both rectangles is not same");			 
	}
}