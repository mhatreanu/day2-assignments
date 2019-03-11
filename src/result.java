import java.util.Scanner;

public class result {

	public static void main(String[] args) {

		double sub1, sub2, sub3;

		System.out.print("Enter Subject1 Marks");
		Scanner sc = new Scanner(System.in);
		sub1 = sc.nextDouble();

		System.out.println("Enter Subject2 Marks");
		
		sub2 = sc.nextDouble();

		System.out.println("Enter Subject3 Marks");
		
		sub3 = sc.nextDouble();

		if (sub1 > 60 && sub2 > 60 && sub3 > 60) {
			System.out.println("Congratulations You Are Passed");
		} 
		else if ((sub1 > 60 && sub2 > 60) || (sub1 > 60 && sub3 > 60) || (sub2 > 60 && sub3 > 60)){
			System.out.println("You Are Promoted");
		}
		else {
			System.out.println("You have failed");
			
		}
		Scanner.Close();
	}
}
