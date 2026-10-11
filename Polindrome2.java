package algoritma;
import java.util.Scanner;
public class Polindrome2 {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("Plase enter a integer ");
int number= input.nextInt();
input.close();

System.out.println(number+ (isPalindrome(number) ?" is ":" is not ")+ " a palindrome");
	}
public static boolean isPalindrome(int number) {
	
	return number==reverse(number)? true:false;
	
}

public static int reverse(int number) {
	
	String reverse= "";
	String n= number+"";
	for (int i=n.length()-1; i>=0; i-- ) {
		
		reverse += n.charAt(i);
	
	}
	return Integer.parseInt(reverse);
}
}
