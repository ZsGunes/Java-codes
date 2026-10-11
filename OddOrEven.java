package algoritma;
import java.util.Scanner;

public class OddOrEven {  //girilen sayı çift mi tek mi
   public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);  
	System.out.println("Enter a number integer ");
	int num= scanner.nextInt();
	scanner.close();
	if(num%2==0)
	System.out.printf("%d is even ", num);
	else
	System.out.printf("%d is odd ",num); 
	
   }

}
