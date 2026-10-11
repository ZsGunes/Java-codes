package algoritma;
import java.util.Scanner;
public class PositiveNegativeAverage {
	public static void main(String[]args) {
Scanner input= new Scanner(System.in);
int positive=0;
int negative=0;
int count=0;
double total=0;
//Promopt the user to enter an integer or 0 to exit
System.out.println("Enter an integer the inputs ends if it is 0: ");
int number= input.nextInt();

if(number==0) {
	System.out.println("No numbers are entered except 0");
	System.exit(1);
}
while(number!=0) {
	if(number>0) 
		positive++;
	else
		negative++;
	
	total= total+number;
    count++;
    number=input.nextInt();
}
input.close();
	//Calculate the avarage
double avarage= total/count;
 
//Display result;
System.out.println("The number of positive is "+ positive +"\nThe number of negative is "+ negative+"\nTotal is total "+ total+"\nThe avarage is "+avarage);







	}
}
