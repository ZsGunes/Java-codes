package algoritma;  
import java.util.Scanner;
public class distance {    //x1,x2,y1,y2 al ve iki nokta arası uzaklığı hesapla
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter x1 and y1 value ");
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		
		System.out.println("Enter x2 and y2 value ");
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		input.close();   //input never closed uyarısı bunu yazmamandan kaynaklı
		double distance= Math.pow(Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2) , 0.5); //0.5 yazarken nokta kullan
		
		System.out.println("Distance is " +distance);
		
		
		
		
		
		
		
		
	}
	

}
