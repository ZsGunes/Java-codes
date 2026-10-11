package algoritma;
import java.util.Scanner;
public class GradeNumber {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	
	// Prompt the user to enter a letter grade A, B, C, D or F
System.out.println("Enter a letter grade ");
String s= input.next();
char ch= s.charAt(0);
	ch= Character.toUpperCase(ch);
input.close();
	if(ch>='A'&& ch<='F'&& ch!='E') {
		
		System.out.println("The numberic value for grade" + ch + "is ");
		
		switch(ch){
			case'A': System.out.println(4); break;
			case'B': System.out.println(4); break;
			case'C': System.out.println(4); break;
			case'D': System.out.println(4); break;
			
		}
		
	
		
	}
	
	
	
	
	
	
}
}
