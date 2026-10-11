package algoritma;
import java.util.Scanner;
public class SphereVolume {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter a radius of sphere ");
	double radius= input.nextInt();
	
	System.out.println("Volume is: "+ sphereVolume(radius));
	}

public static double sphereVolume(double radius) {
	double volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
	return volume;
	
}

}
