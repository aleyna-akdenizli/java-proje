package javaders;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	float v,f,q;
	System.out.println("Vize notunu giriniz: ");
	v=input.nextFloat();
	System.out.println("Final notunu giriniz: ");
	f=input.nextFloat();
	System.out.print("Quiz notunu giriniz: ");
	q=input.nextFloat();
	float ort=(v*30/100)+(q*10/100)+(f*60/100);
	System.out.println("Not ortalamanız: " +ort);
	String sonuc=(ort>=50) ? "Geçtiniz" : "Kaldınız";
	System.out.println(sonuc);

}
}