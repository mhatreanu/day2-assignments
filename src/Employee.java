import java.util.*;
import java.lang.Math;

public class Employee 
{
	

	private int employeeId;
	private String employeeName;
	private	double monthlyBasic;
	
	Employee()
	{
	}
	
	
	Employee(int employeeId, String employeeName, double monthlyBasic)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.monthlyBasic=monthlyBasic;
	}

	public double getAnnualBasic()
	{
		return 12*this.monthlyBasic;
	}
	
	public double getMonthlyGrossSalary()
	{
		double hra=0.5*this.monthlyBasic;
		double medicalAllowance=1250;
		double conveyanceAllowance=800;
		return monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
	}
	
	public double getAnnualGrossSalary()
	{
		return 12*getMonthlyGrossSalary();
	}
	
	public double getMonthlyDeductions()
	{
		double providentFund=0.1*monthlyBasic;
		double pf;
		double esic;
		double professionalTax;

		if (providentFund<6500)
			pf=providentFund;
		else pf=6500;
		
		esic=(4.75)*monthlyBasic;

		if(getMonthlyGrossSalary() <= 10000)
			professionalTax=50;
		else professionalTax=100;

		return pf+esic+professionalTax;
	}
	
	public double getMonthlyTakeHome()
	{
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	
	}

	
	public double getAnnualTakeHome()
	{
		return 12*getMonthlyTakeHome();
	
	}
}
	
		
		