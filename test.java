package com.cessar.program;
import java.util.Scanner;

class test {
    public static void main(String args[]){
        System.out.println("---------------------Selamat datang--------------------");
		String nama,xen ,ces ;
		
		int a = 23;
		int b = 43;
		int c = a+b;
		System.out.println("      ");
		
	Scanner Keyboard = new Scanner(System.in);
	
	System.out.print("masukkan nama : ");
	nama = Keyboard.nextLine();

	System.out.print("masukkan email :");
	xen = Keyboard.nextLine();
	
	System.out.print("nilai c adalah : "+ c + xen);
    }
}