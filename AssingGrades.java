package algoritma;
import java.util.Scanner;
public class AssingGrades {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the number of students: ");
	int[]scores= new int[input.nextInt()];
	char[] grades= new char[scores.length];
	input.close();
	System.out.println("Enter"+ scores.length+"scores:");
	 for(int i=0; i<scores.length; i++) {
		 scores[i]=input.nextInt();
	 }
	 
	 getGrades(scores,grades);
	 
	 for (int i=0; i<scores.length; i++) {
		 System.out.println("Student"+i+"score is "+scores[i]+"and grades is "+grades[i]);
	 } 
}

public static int max(int[]array) {
	int max= array[0];
	for(int i=1; i<array.length; i++) {
		if(array[i]>max)
			max =array[i];
		
	}
	return max;	
}

public static void getGrades(int[] scores, char[] grades) {
	int best= max(scores);
	for(int i=0; i<scores.length; i++) {
		if(scores[i]>=best-10)
			grades[i]='A';
		else if(scores[i]>=best-20)
			grades[i]='B';
		else if(scores[i]>=best-30)
			grades[i]='C';
		else if(scores[i]>=best-40)
			grades[i]='D';
		else
			grades[i]='F';
	}
}

}
