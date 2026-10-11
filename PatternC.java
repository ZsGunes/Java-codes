package algoritma;
import java.util.Scanner;
public class PatternC {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	input.close();
	
	int numberOfLines=6;
	System.out.println("PatterC");
	for(int rows=1; rows<=numberOfLines; rows++) {
		for(int s=numberOfLines-rows; s>=1; s--) {
			System.out.print("  ");
		}
		for(int col=rows; col>=1; col--) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	
	
	
}
}
