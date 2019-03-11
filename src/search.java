import java.util.Scanner;

public class search {
	public static void main(String[] args) {
	 int arr[]=new int[15];
	 int n;
	 int flag=0;
     System.out.println("enter elements");

     for(int i=0;i<15;i++){
    	 Scanner sc = new Scanner(System.in);
    	 arr[i]=sc.nextInt();
     }
     
     System.out.println("enter element to search"); 
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     
     for(int i=0;i<15;i++){
    	 if(n==arr[i]) {
    		 flag=1;
    		 break;
    	 }
    	 if(flag==1)
    	 break;
     }
     if(flag==1)
    	 System.out.println("entered element is present"); 
     else
    	 System.out.println("entered element is not present"); 
     }


}
