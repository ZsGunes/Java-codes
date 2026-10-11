package algoritma;
import java.util.Scanner;
public class ReplaceNumbers {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		 System.out.print("Enter two numbers to replace");
		 int num1= scanner.nextInt();
		 int num2= scanner.nextInt();
scanner.close();
		 int swap= num1;
		 num1=num2;
		 num2=swap;
		 
		 System.out.println("The replace numbers are: ");
		 System.out.println("Number 1 is: " +num1);
		 System.out.println("Number 2 is: " +num2);
		 
		 
	}

}
