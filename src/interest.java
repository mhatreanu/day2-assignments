import java.util.Scanner;

public class interest {
	public static void main(String[] args) {
		double amount;
		double interest;
		double rate;
		double number;
		double si;
		double principle;
		double ci;
		System.out.println("Enter Principle");
		Scanner sc = new Scanner(System.in);
		principle = sc.nextInt();
		
		System.out.println("Enter no. of years");
		Scanner sc1 = new Scanner(System.in);
		number = sc.nextInt();
		
		System.out.println("Enter rate of interest");
		Scanner sc2 = new Scanner(System.in);
		rate = sc.nextInt();
		si= ((principle*number*rate)/100);
		ci=principle*(1+Math.pow(rate/100,number));
		
		System.out.println("Simple interest is:"+si);
		System.out.println("Compound interest is:"+ci);
		
	}

}
