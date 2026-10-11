package algoritma;
import java.util.Scanner;
public class VowelOrCons {
public static void main(String[]args) {
	
	Scanner input= new Scanner(System.in);
	
	// Prompt the user to enter a letter
	System.out.println("Enter a letter ");
	String s= input.nextLine();
	char ch= s.charAt(0); //ilk hane
	input.close();
if (Character.isLetter(ch)) {
	switch(Character.toUpperCase(ch)) {
	
	case'A':
	case'E':
	case'I':
	case'O':
	case'U':
		System.out.println(ch+" is vowel ");
		break;
		
		default: System.out.println(ch+" is a consonant");
	}
}
	
else
	System.out.println("İnvalid input");
	
	

 
 }
}
