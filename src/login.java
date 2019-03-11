import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		String name = "anu";
		String word = "anu";
		String username;
		String password;
		int flag = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter Your Username");
			Scanner sc = new Scanner(System.in);
			username = sc.nextLine();

			System.out.println("Enter Your Password");
			Scanner sc1 = new Scanner(System.in);
			password = sc1.nextLine();

			if (username.equals(name) && password.equals(word)) {
				flag = 1;
				break;
			}
			if(flag==1)
				break;
		}
	
		if(flag==0)
		{
			System.out.println("Contact Admin");
		}
		else
		{
			System.out.println("Welcome");
		}
		
	}

}
