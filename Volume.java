package algoritma;
import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	double radius;
	System.out.println("Radius enter");
	radius= input.nextDouble();
	input.close();
	System.out.printf("Volume is %f%n", sphereVolume(radius));

	}

	public static double sphereVolume(double radius) {
		
		double volume=(4.0/3.0)* Math.PI*Math.pow(radius,3);
		
		return volume;
		
		
		
	}
	
}
