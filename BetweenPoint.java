package algoritma;
import java.util.Scanner;
public class BetweenPoint {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);

System.out.println("X1: ");
double x1=input.nextDouble();

System.out.println("X2: ");
double x2=input.nextDouble();

System.out.println("Y1: ");
double y1=input.nextDouble();

System.out.println("Y2: ");
double y2=input.nextDouble();

input.close();
System.out.printf("Distance between these two points are "+ distance(x1,x2,y1,y2));
	}
public static double distance(double x1,double y1, double x2, double y2) {
	
	double distance= Math.pow((Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)),0.5);
	return distance;
	
}
}
