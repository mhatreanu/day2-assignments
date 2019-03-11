class RectangleMain
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(2,3);
		Rectangle r2 = new Rectangle(2,3);
                   
                Rectangle r3 = new Rectangle();
                
		System.out.println("Perimeter of first rectangle is:"+r1.perimeter());
		System.out.println("Area of first rectangle is:"+r1.area());
		System.out.println("Perimeter of second rectangle is:"+r2.perimeter());
		System.out.println("Area of second rectangle is:"+r2.area());
		r3.compareArea(r1,r2);
	}
}
		