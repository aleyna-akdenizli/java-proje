package javaders;

import java.util.Scanner;


public class Lessonss {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz: ");
		float sayi1=scan.nextFloat();
		System.out.println("İknci sayıyı giriniz:");
		float sayi2=scan.nextFloat();
		System.out.println("Yapmak istediğiniz işlemi giriniz.");
		System.out.println("1-Toplama,2-Çıkarma,3-Bölme,4-Çarpme,5-Mod Alma:");
		int sayi3=scan.nextInt();
		switch(sayi3) {
		case 1:
			
			System.out.println("Sonucunuz: "+(sayi1+sayi2));
			break;
		case 2:
			System.out.println("Sonucunuz: "+(sayi1-sayi2));
			break;
		case 3:
			if(sayi2==0) {
				System.out.println("Payda 0 olamaz");
			}
			else {
				System.out.println("Sonucunuz: "+(sayi1/sayi2));
			}
			break;
		case 4:
			System.out.println("Sonucunuz: "+(sayi1*sayi2));
			break;
		default:
			System.out.println("Lütfen geçerli bir sayı giriniz.");
			
		}
        
		
        
		
		
		
   
    
		
	}

}
