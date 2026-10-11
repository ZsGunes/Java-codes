package algoritma;   //kullanıcıdan 4 girdi al en büyükle söyle ve top,çık,çarp,bölme hesabı yap
import java.util.Scanner;
public class alıştırma {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter first number");
		int number1= input.nextInt() ;
		System.out.print("Enter second number");
		int number2= input.nextInt();
		System.out.print("Enter third number");
        int number3= input.nextInt();
        System.out.print("Enter fourt number");
        int number4= input.nextInt();
        input.close();
        
        int sum= number1+number2+number3+number4;
        int sub= number1-number2-number3-number4;
        int div= number1/number2/number3/number4;
        int mul= number1*number2*number3*number4;
        
        int larg=number1;
        if(number1<number2)
        	larg=number2;
        if(number3>larg)
        	larg=number3;
        if(number4>larg)
        	larg=number4;
        
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Sub is %d%n", sub);
        System.out.printf("Div is %d%n", div);
        System.out.printf("Mul is %d%n", mul);
        System.out.printf("Larg is %d%n", larg);
	}

}
