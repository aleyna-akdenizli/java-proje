package javaders;

import java.util.Scanner;

public class NotOrtalamasıHesabı {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Vize notunuzu giriniz: ");
	float vize=input.nextFloat();
	System.out.println("Final notunuzu giriniz: ");
	float final1=input.nextFloat();
	float not=(vize*40/100)+(final1*60/100);
	System.out.println("Devamsızlık durumunuzu giriniz: ");
	float devamsizlik=input.nextFloat();
	if (not>60 && devamsizlik<10) {
		System.out.println("Başarılı.Not:  ,Devamsızlık: ");
	}
	else if(not<60 && devamsizlik<10) {
		System.out.println("Ders sınav ortalamasından kaldı.Not: "+not);
		
	}
	else if(not>60 && devamsizlik>10) {
		System.out.println("Devamsızlıktan kaldı.Not: "+not);
	}
	else if(not<60 && devamsizlik>10) {
		System.out.println("Hem devamsızlıktan hem de sınav ortalamasıyla kaldı.Not: "+not);
	}
	else {
		System.out.println("Geçerli bir karakter giriniz.");
	}

	}

}
