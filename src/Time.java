public class Time{
	private int hours;
	private int minutes;
	
	public void setTime(int hours, int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}

	public void showTime()
	{
		if(this.minutes>=60)
			{
				this.hours=this.hours+1;
				this.minutes=this.minutes-60;
			}
		System.out.println(hours);
		System.out.println(minutes);
	}

	public Time timeSum(Time t)
	{
	 	Time t4=new Time();
		t4.hours=this.hours+t.hours;
		t4.minutes=this.minutes+t.minutes;
		return t4;	
	}
}