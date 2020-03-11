import java.util.Random;

public class random {
	public static void main (String [] args){
		Random rndm = new Random();
		int a = rndm.nextInt(10);
		System.out.println (a);
		int b = a + 3;
		System.out.print (a +" + 3 = "+ b);
		
	}
}