package javaders;

import java.util.Scanner;

public class Us_Alma {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Tabanı giriniz:");
	    int taban=input.nextInt();
	    System.out.println("Üssü giriniz: ");
	    int üs=input.nextInt();
		int k=1;
		int toplam=1;
		while(k<=üs) {
			toplam=toplam*taban;
			k++;
		}
		
		System.out.println("sayınız:" +toplam);

	}

}
