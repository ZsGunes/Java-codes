package algoritma;
import java.util.Scanner;

public class Tips {   //Total tutardan kişinin gireceği oran doğrultusunda bahşiş hesabı yapıp bahşişli tutarı gösteren bir uygulama yaz.
 public static void main(String[] args) {
	 Scanner input= new Scanner(System.in);
	 System.out.print("Enter the subtotal and a gratuity rate: ");
	 double subtotal= input.nextDouble();
	 double gratuityRate= input.nextDouble();
	 input.close();
	 double gratuity= (subtotal* gratuityRate)/100;
	 double total= gratuity+subtotal;
	 
	 System.out.println("The gratuity is " +gratuity + "TL and total is " +total +"TL");
	 
	 
	 
 }
 
}
