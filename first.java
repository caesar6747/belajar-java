import java.util.Scanner;

public class first {
	public static void main (String args [] ) {

		Scanner Keyboard = new Scanner(System.in);
		String pw;
		String pw2;
		boolean as = true;

		System.out.println ("----- Selamat Datang -----");
		System.out.println ("Silahkan masukkan password : ");
		pw = Keyboard.nextLine();

		if (pw.equals("12345")) {
			System.out.println ("Lanjutkan...");
		}
		else {
			System.out.println ("Password Salah");
		}

		
		while (as) {
			System.out.print ("masukkan password :");
			pw2 = Keyboard.nextLine();

			if (pw2.equals("inipasswordnya")){
				as = false;
				System.out.println ("Lanjutkan");
			}
			else {
				System.out.println ("Password Salah, Ulagi!");
			}
		}
		
	}
}