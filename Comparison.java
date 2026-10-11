package algoritma;
import java.util.Scanner; //kullanıcı verisi almayı sağlar.
public class Comparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // veri almaya yarıyor.
System.out.print("Enter first integer");
int number1= scanner.nextInt();
System.out.print("Enter second integer");
int number2= scanner.nextInt();
scanner.close();

if(number1==number2)
	System.out.println("These numbers are equal");
if(number1<number2)
	System.out.printf("%d is larger", number2);
else
	System.out.printf("%d is larger", number1);

	}

}
