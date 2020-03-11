import java.util.Scanner;

class diskon {
	public static void main (String args[])	{
		System.out.println ("-----Program Menghitung diskon-----");
		int harga, diskon1, diskon2, diskon3, bayar;

		Scanner Keyboard = new Scanner (System.in);

		System.out.print ("Harga Barang yang dibeli : ");
		harga = Keyboard.nextInt();


		if (harga > 50000){
			bayar = harga - 20000;
			System.out.println (bayar);
		}

		else {
			bayar = harga;
			System.out.println (bayar);
		}



	}
}