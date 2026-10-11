package algoritma;
import java.util.Scanner; //Üç basamaklı sayı girilisin ve palindrom olup olmadığını söylesin
public class PalindromeNumber {
  public static void main(String[]args) {
	  Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter a three digit number ");
	  int number=scanner.nextInt();
	  scanner.close();
	  int first= number/100;
	  int last= number%10;
	  
	  if (first==last)
	  System.out.println("Your number is palindrome ");
	  else
		  System.out.println("Your number is not palindrome ");
	  
	  
  }
}
