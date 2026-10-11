package algoritma;
import java.util.Scanner;
public class Area {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter a side:");
	double side= input.nextDouble();
	input.close();
	double area= (6* Math.pow(side, 2.0))/ (4* Math.tan(Math.PI/6));
	
	System.out.println("The are of the hexagon is: "+area);   //Lab çözümlerinde println le değil printf ile çözüm var gereksiz.
	
	
	
	
	
}

}
