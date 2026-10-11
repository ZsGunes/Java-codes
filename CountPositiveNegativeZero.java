package algoritma;    //Üç girdi al ve girilen sayılardan kaçı pozitif kaçı negatif yada sıfır hesapla.
import java.util.Scanner;
public class CountPositiveNegativeZero {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
System.out.println("Enter first integer ");
int num1= scanner.nextInt();
System.out.println("Enter second integer ");
int num2= scanner.nextInt();
System.out.println("Enter finaly integer ");
int num3= scanner.nextInt();
scanner.close();

int zero=0 , positive=0 ,negative=0;

if(num1==0)
	zero++;
if(num2==0)
	zero++;
if(num3==0)
	zero++;

if(num1<0)
	negative++;
if(num2<0)
	negative++;
if(num3<0)
	negative++;

if(num1>0)
	positive++;
if(num2>0)
	positive++;
if(num3>0)
	positive++;

System.out.println("Number of positives: " +positive);
System.out.println("Number of negative: " +negative);
System.out.println("Number of zeros: " +zero);



	}

}
