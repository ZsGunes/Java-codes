package algoritma;
                        //araba plakası çıkarma The range of ASCII values is 65 to 90 (A to Z)
public class VehiclePlateNum {
public static void main(String[]args) {
	
//Generate three random uppercase letters
	int letter1= 65+(int)(Math.random()*(90-65+1));
	int letter2= 65+(int)(Math.random()*(90-65+1));
    int letter3= 65+(int)(Math.random()*(90-65+1));

// Generate four random digits
	int num1= (int)(Math.random()*10);
	int num2= (int)(Math.random()*10);
	int num3= (int)(Math.random()*10);
	int num4= (int)(Math.random()*10);
	
	// Display number plate.  letter lar getirilirken char koymayı unutma A-Z çıktısı almak için gerekli..
System.out.println(""+(char)(letter1) +((char)(letter2))+ ((char)(letter3))+num1+num2+num3+num4);
	
  }

}
