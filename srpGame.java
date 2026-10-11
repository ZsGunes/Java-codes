package algoritma;
import java.util.Scanner;

public class srpGame {
 public static void main (String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Choose the one number (0 for scrissor, 1 for rock, 2 for paper)");
	int user= input.nextInt();
	int comp= (int)(Math.random()*3);
	input.close();
	
	System.out.print("The computer is ");
	switch (comp) {
	case 0: System.out.println("Scrissor");
	break;
	case 1: System.out.println("Rock");
	break;
	case 2: System.out.println("Paper");
	break;
	}
	
	System.out.print("You are ");
	switch (user) {
	case 0: System.out.println("Scrissor");
	break;
	case 1: System.out.println("Rock");
	break;
	case 2: System.out.println("Paper");
	break;
	}
	
	if(comp==user)
		System.out.println(" too. It is a draw");
	else {
		boolean win= (user==0 && comp==2)|| (user==1 && comp==0)||(user==2 && comp==1);
	
	if (win)
		System.out.println("You won!");
	else
		System.out.println("You lose!");
	}

 }

}
