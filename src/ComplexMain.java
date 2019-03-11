import java.util.*;
public class ComplexMain{
	public static void main(String[] args) 
	{
		Complex c1=new Complex(2,3);
		c1.display();
		
		Complex c2=new Complex(4,5);
		c2.display();

		Complex c3=new Complex();
		c3.complexSum(c1,c2);
	}
}