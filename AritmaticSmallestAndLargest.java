package algoritma;
import java.util.Scanner;
public class AritmaticSmallestAndLargest {

	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
System.out.print("Enter first integer ");
int number1= input.nextInt();
System.out.print("Enter second integer ");
int number2= input.nextInt();
System.out.print("Enter thrid integer ");
int number3= input.nextInt();
input.close();

int sum= number1+number2+number3;
int average= sum / 3;
int pro= number1* number2* number3;

int largest=number1;
if(number2>largest)
	largest=number2;
if(largest<number3)
	largest=number3;

int smallest=number1;
if(number2<number1)
	smallest=number2;
if(smallest>number3)
	smallest=number3;

System.out.printf("Sum is %d%n", sum);
System.out.printf("Average is %d%n", average);
System.out.printf("Product is %d%n", pro);
System.out.printf("Largest is %d%n", largest);
System.out.printf("Smallest is %d%n", smallest);

	}

}
