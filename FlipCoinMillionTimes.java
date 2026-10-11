package algoritma;

public class FlipCoinMillionTimes {

	public static void main(String[] args) {
int heads;
int tails;
int coin;
heads=tails=0;
//Simulate flipping a coin one millon times
System.out.println("Fipping a coin one million times ");
for(int i=0; i<1000000; i++) {
	coin=(int)(Math.random()*2)==0 ? heads++ : tails;
	
}

System.out.println("Heads: "+heads+ "Tails: "+tails);
	}

}
