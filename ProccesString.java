package algoritma;
import java.util.Scanner; // bir cümle girilecek cümledeki harf sayısı ve ilk harfin ne olduğunu söyleyecek.
public class ProccesString {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	// Prompt the user to enter a string
System.out.println("Enter a string ");
String str= input.nextLine();
input.close();
//Display the string's length and its first character
System.out.println(str+" has a length of "+ str.length()+" and its first char is "+ str.charAt(0) +" second char is "+ str.charAt(1)); //str.length harf sayısını, str.charAt() iç parantezde hangi sayı varsa -1 deki harfi gösterecek.

	
	
	
	
	
	
	
	
	
}

}
