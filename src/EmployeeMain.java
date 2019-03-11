import java.util.*;
class EmployeeMain
{
	public static void main(String[] args) 
	{
		
			/*System.out.println("Enter a Employee ID");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();

			System.out.println("Enter a Employee Name");			
			String name = sc.next();

			System.out.println("Enter a Employee Salary");			
			double monthlyBasic= sc.nextDouble();*/

		Employee e=new Employee(123,"abc",12000);
		System.out.println("Annual basic is"+e.getAnnualBasic());
		System.out.println("Monthly gross salary is"+e.getMonthlyGrossSalary());
		System.out.println("Annual gross salary"+e.getAnnualGrossSalary());
		System.out.println("Monthly deduction is"+e.getMonthlyDeductions());
		System.out.println("Monthly take home"+e.getMonthlyTakeHome());	
		System.out.println("Annual take home"+e.getAnnualTakeHome());		
	}
}