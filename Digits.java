package algoritma;
import java.util.Scanner;  //bir sayı gir ve rakamlarını topla
public class Digits {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number between 0 and 1000 ");
	int num= input.nextInt();
	input.close();
	int lessThan10= num%10;
	num= num/10;
	int ten= num%10;
	num=num/10;
	int hund= num%10;
	num=num/10;
	
	int sum= lessThan10+ten+hund;
	
	System.out.print("The sum of the digits is " +sum);
	

  }


}
