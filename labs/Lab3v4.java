
import java.util.Scanner;
public class Lab3v4 {

	public static void main(String[] args) 
	{
		System.out.println("Enter two 3-digit numbers:");
		 Scanner scan = new Scanner(System.in);
		 int n1 = scan.nextInt();
		 int n2 = scan.nextInt();
		
		 if ((2*(n1+n2)) %3 == 0 && (2*(n1+n2) %7 != 0))
			 {
			 System.out.print("\nYour enigma number is ");
			 System.out.print(n1/100);
			 System.out.println(2*(n1+n2));
			 }
		 else if ((2*(n1+n2) %3 != 0 && 2*(n1+n2) %7 == 0))
		         {
			     System.out.print("\nYour enigma number is ");
			     System.out.print(n2 %10);
			     System.out.println(2*(n1+n2));
		         }		 
		 else if ((2*(n1+n2) %3 == 0 && 2*(n1+n2) %7 == 0))
		          {
			      System.out.print("\nYour enigma number is ");
			      System.out.print(n2/2);
			      System.out.print(n1*2);
			      System.out.println("5");
		          }	   
		 else if (2*(n1+n2) %3 !=0 && 2*(n1+n2) %7 != 0)
			   {
			   System.out.print("\nYour enigma number is ");
			   System.out.print(n1/2);
			   System.out.println(n2/3);
			   }
		 
		 scan.close();
	}

}
