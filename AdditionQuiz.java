package algoritma;
import java.util.Scanner;
public class AdditionQuiz {  // compiler random 3 sayı üretecek ve kullanıcı toplamı bulacak.
 public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 int digit1= (int)(Math.random()*10);  //0dan 10 a kadar random sayı üretir
	 int digit2= (int)(Math.random()*10);
	 int digit3= (int)(Math.random()*10);
	 
	 System.out.println("What is " +digit1 +"+" +digit2 +"+" +digit3 +"?");
	 
	 int answer= input.nextInt();
	 input.close();
	 System.out.println(digit1+ "+"+digit2+"+"+digit3+"= "+answer+" is "+ (digit1+digit2+digit3==answer));
	                                                                    //true or false döndürür.
 }
 
}
