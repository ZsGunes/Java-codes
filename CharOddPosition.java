package algoritma;
import java.util.Scanner;
public class CharOddPosition {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String string= input.nextLine();
	input.close();
	
	String oddPos="";
	for(int i=0; i<string.length(); i+=2) {
		oddPos+= string.charAt(i);
	}
	
	System.out.println(oddPos);	
	
	
	
	
	
}

}
