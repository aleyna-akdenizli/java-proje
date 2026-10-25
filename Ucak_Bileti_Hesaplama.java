package javaders;
import java.util.Scanner;

public class Ucak_Bileti_Hesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("HAVAYOLU ŞİRKETİMİZE HOŞGELDİNİZ...");
		System.out.println("Lütfen bilgilerinizi büyük puntolarla giriniz...");
		System.out.println("İsminiz: ");
		String isim=input.nextLine();
		System.out.println("Soyisminiz: ");
		String soyisim=input.nextLine();
		System.out.println("Yaşınız: ");
		int yas=input.nextInt();
		input.nextLine();
		System.out.println("Uçuş yapacağınız yer: ");
		String yer=input.nextLine();
		System.out.println("Uçuş yapacağınız tarih: ");
		String tarih=input.nextLine();
		System.out.println("Uçuş yapacağınız yere uzaklığınız (km cinsinden): ");
		double km=input.nextDouble();
		input.nextLine();
		System.out.println("gidiş dönüş mü?(EVET/HAYIR): ");
		String cevap=input.nextLine();
		double yolculuk=km*0.10;
		if (yas<12) {
			yolculuk=yolculuk-(yolculuk*50/100);
		}
		else if(12<yas && yas<24) {
			yolculuk=yolculuk-(yolculuk*10/100);
			
		}
		else if(yas>65) {
			yolculuk=yolculuk-(yolculuk*30/100);
		}
		else {
			yolculuk=yolculuk;
		}
		if(cevap=="evet") {
			yolculuk=yolculuk-(yolculuk*20/100);
		}
		else {
			yolculuk=yolculuk;
		}
		
		System.out.println("*********************");
		System.out.println("    UÇAK BİLETİNİZ    ");
		System.out.println("ADINIZ: "+isim);
		System.out.println("SOYADINIZ: "+soyisim);
		System.out.println("YAŞINIZ: "+yas);
		System.out.println("VARIŞ YERİ: "+yer);
		System.out.println("UÇUŞ TARİHİ: "+tarih);
		System.out.println("BİLET FİYATI: "+yolculuk+ "$");
		System.out.println("*********************");
		System.out.println("Biletinizi yanınızdan ayırmayınız.İyi yolculuklar dileriz...");
		
		
		

	}

}
