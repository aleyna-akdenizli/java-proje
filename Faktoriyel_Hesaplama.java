package javaders;
import java.util.Scanner;

public class Faktoriyel_Hesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi=input.nextInt();
		int k=1;
		int toplam=1;
		while(k<=sayi) {
			toplam=toplam*k;
			k++;
		}
		System.out.println(sayi+" faktöriyel sonucu: " +toplam);
	}
	

	}


