public class Distance{
	
	private int feets;
	private double inches;
	
	public int setFeets(int feets)
	{
		this.feets=feets;
		return 0;
	}	

	public double setInches(double inches)
	{
		this.inches=inches;
		return 0;
	} 
	public void display()
	{
		if(this.inches>=12)
		{
			this.feets=this.feets+1;
			this.inches=this.inches-12;
		}
		System.out.println("Distance is"+this.feets+"feets"+this.inches+"inches");
	}

	public Distance addDistance(Distance d2)
	{
		Distance d4=new Distance();
		d4.inches=this.inches+d2.inches;
		d4.feets=this.feets+d2.feets;
		return d4;
	}
	
}