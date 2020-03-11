import java.util.Random;
import java.util.Scanner;

public class soal {
	public static void main (String [] args){

		System.out.println ("----- Selamat Datang -----");		
	
		Scanner Keyboard = new Scanner(System.in);
		Random rndm = new Random();
		int [] a = new int [15];
		int i = 0;
		int j = 0;
		int [] k = new int [15];
		int [] jawaban = new int [15];
		int [] g = new int [15];
		boolean z = true ;
		int r = 0;
		int nilai = 0;
		
		
		a[0] = rndm.nextInt(10);
		a[1] = rndm.nextInt(10);
		a[2] = rndm.nextInt(10);
		a[3] = rndm.nextInt(10);
		a[4] = rndm.nextInt(10);
		a[5] = rndm.nextInt(10);
		a[6] = rndm.nextInt(10);
		a[7] = rndm.nextInt(10);
		a[8] = rndm.nextInt(10);
		a[9] = rndm.nextInt(10);
		a[10] = rndm.nextInt(10);

		g[0] = rndm.nextInt(10);
		g[1] = rndm.nextInt(10);
		g[2] = rndm.nextInt(10);
		g[3] = rndm.nextInt(10);
		g[4] = rndm.nextInt(10);
		g[5] = rndm.nextInt(10);
		g[6] = rndm.nextInt(10);
		g[7] = rndm.nextInt(10);
		g[8] = rndm.nextInt(10);
		g[9] = rndm.nextInt(10);
		g[10] = rndm.nextInt(10);
		

		while ( z ) {
		k[i] = a[i] + g[i] ;
		System.out.print (a[i] + " + " + g[i] + " = ");
		jawaban[i] = Keyboard.nextInt();
		if ( jawaban[i] == k[i] ){
		r++;
		}
		else {
		z = false ;
		}
		
		if ( i == 9 ){
		z = false ;
		}

		i++;
		}

		nilai = r * 10;
		System.out.print ("Score : " + nilai );

	}
}
