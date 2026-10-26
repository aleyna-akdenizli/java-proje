package javaders;
import java.util.Scanner;
public class Desen_Olusturma {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");

		int sayi=input.nextInt();
		int k=1;
	
		while(k<=sayi) {
			int i=1;
			while(i<=k) {
				System.out.print("*");
				i++;
			}
			System.out.println(" ");
			k++;
		}
	}

}
