public class TimeMain{
	public static void main(String args[])
	{
		Time t1=new Time();
		t1.setTime(10,55);
		t1.showTime();
		
		Time t2=new Time();
		t2.setTime(11,59);
		t2.showTime();
		
		Time t3=new Time();
		t3=t1.timeSum(t2);
		t3.showTime();
	}
}