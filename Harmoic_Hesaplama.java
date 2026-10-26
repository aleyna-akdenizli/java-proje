package javaders;
import java.util.Scanner;
public class Harmoic_Hesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
        float sayi=input.nextFloat();
	    float toplam=0;
		float k=1;
		while(k<=sayi) {
			toplam=toplam+(1/k);
			k++;
		}
		System.out.println("Harmoni Sonucu: "+toplam);

	}

}
