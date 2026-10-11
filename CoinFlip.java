package algoritma;
import java.util.Scanner;
public class CoinFlip {
 public static void main(String[]args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter the your guess 0 for hands, 1 for tails");
	 int user= input.nextInt();
	 input.close();
	 int comp= (int)(Math.random()*2);
	 
	 if(user==comp)
		 System.out.println("You are correct");
	 else
		 System.out.println("Wrong! The correct answer is "+comp);
 }
}
