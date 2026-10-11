package algoritma;
import java.util.Scanner;
public class CheckPassword {
public static void main(String[]args) {
Scanner input= new Scanner(System.in);

System.out.println("Enter a password: ");
String password= input.nextLine();
input.close();
System.out.println((isValidPassword(password) ? "Valid" : "İnvalid")+"Password");
}

public static boolean isValidPassword(String password) {
	
	final int LENGHT_OF_VALID_PASSWORD=8;
	final int MINIMUM_NUMBER_OF_DIGITS=2;
	
	boolean validPassword= isLengthValid(password,LENGHT_OF_VALID_PASSWORD)&&isOnlyLettersAndDigits(password)&&hasDigits(password,MINIMUM_NUMBER_OF_DIGITS);
	
	return validPassword;
	
}

public static boolean isOnlyLettersAndDigits(String password) {
	for (int i=0; i< password.length(); i++) {
		
		if (!Character.isLetterOrDigit(password.charAt(i))) {
			
			return false;
		}
	}
	
	return true;
}
public static boolean isLengthValid(String password,int validLenght) {
	return password.length()>= validLenght;
}

public static boolean hasDigits(String password,int n) {
	int numberOfDigits=0;
	for(int i=0; i<password.length();i++) {
		if (Character.isDigit(password.charAt(i))) {
			numberOfDigits++;
		}
		if(numberOfDigits>=n) {
			return true;
		}
	}
	return false;
}
}


