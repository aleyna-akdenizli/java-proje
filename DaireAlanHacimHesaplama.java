package javaders;

import java.util.Scanner;

public class DaireAlanHacimHesaplama {
	
    public static final float pi =3.15f;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		float r,a,hc,h;
		System.out.println("Hacmini ve alanını hesaplamak istediğiniz yarıçapı giriniz: ");
		r=input.nextFloat();
		System.out.print("Hacmini ve alanını hesaplamak istediğiniz dairenin uzunluğunu giriniz: ");
		h=input.nextFloat();
		if(h>100) {
			h=h/100;
		}
		else {
			h=h;
		}
		
		a=pi*r*r;
		hc=pi*r*r*h;
		System.out.println("Dairenin alanı: "+a);
		System.out.println("Dairenin hacmi: "+hc);

	}

}
