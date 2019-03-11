public class DistanceMain{
	public static void main(String[] args)
	{
		Distance d1 = new Distance();
		Distance d2 = new Distance();
		
	
		d1.setFeets(11);
		d1.setInches(13);
		d1.display();

	
		d2.setFeets(13);
		d2.setInches(3.5);
		d2.display();
		
	
		Distance d3;
		d3=d1.addDistance(d2);
		d3.display();
	}
}	