import java.util.Scanner;

class testing {

	public static void main (String args[]) {
		System.out.println ("______Program Lagi Program Lagi");
		System.out.print ("Masukkan nama : ");
		Scanner Keyboard = new Scanner (System.in);

		int matrix [][] = new int [5][5];
		
		String a = Keyboard.nextLine();
		
		
		int i, j, k, x;
		
		System.out.print("Masukkan Panjang Matrix : ");
		k = Keyboard.nextInt();
		System.out.print("Masukkan Lebar Matrix : ");
		x = Keyboard.nextInt();

		for (i=0; i<k; i++) {
			for (j=0; j<x; j++){
				System.out.print("masukkan nilai " + "(" + i + "," + j + " ) : ");
				matrix [i][j] = Keyboard.nextInt();
			}
		}

		int l, b, w, e ;
		for (w=0; w<matrix.length; w++) {
			for (e=0; e<matrix[0].length; e++){
				System.out.print(matrix[w][e] + "  ");
			}
		System.out.println();
		}
	}
} 
