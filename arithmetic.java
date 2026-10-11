package algoritma;
import java.util.Scanner;
public class arithmetic {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
 int number1;
 int number2;
 int sum,sub,div,mul;
 
 System.out.print("Enter first integer ");
 number1= input.nextInt();
 
 System.out.print("Enter second integer ");
 number2= input.nextInt();
 input.close();
 
 sum= number1+number2;
 mul= number1 * number2;
 div= number1/ number2;
 sub= number1-number2;
 
 System.out.printf("Sum is %d%n", sum);  // printf string ve int verisini yazdırırken kullanılır.
 System.out.printf("Produt is %d%n", mul); //%n \n ile aynı sadece bağımsız hali
 System.out.printf("Difference is %d%n", sub);
 System.out.printf("Quotient is %d%n", div);  //%d int value alırken veriyi çekmek için kullanılır ondalıklı sayıyı yani decimal sayısının temsilidir.
 
	}

}
