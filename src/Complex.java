class Complex{
	private double imaginary;
	private double real;

	Complex(){}

	Complex (double real, double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void display()
	{
		System.out.println("Complex Number is:" +real + "+" +imaginary + "i");
	}

	public void complexSum(Complex c1, Complex c2)
	{
		double sum1=0,sum2=0;
		 sum1=c1.real+c2.real;
		 sum2=c1.imaginary+c2.imaginary;

		System.out.println("Sum="+ sum1+ "+" +sum2+"i");
	}
}	