package abstract_sinifi_java;

import java.util.Scanner;
import abstract_sinifi_java.EkmekFiyatiKarsilastirmasi;

public class MusteriTercihi {
	EkmekFiyatiKarsilastirmasi ekmekfiyatikarsilastirmasi;
	Scanner yaz = new Scanner(System.in);
	
	void EkmekAlisverisiYap() {
		System.out.print("Kac ekmek alacaksiniz? : ");
		int ekmekSayi = yaz.nextInt();
		System.out.println("-->Ekmek Fiyati: " + ekmekfiyatikarsilastirmasi.ekmekAl(ekmekSayi) / ekmekSayi +" TL");
		System.out.println(ekmekSayi + " adet ekmek icin " + " odeyeceginiz tutar: " + ekmekfiyatikarsilastirmasi.ekmekAl(ekmekSayi) + " TL");
		System.out.println("----------------");
	}
public class Main{
	public static void main(String[] args) {
		
		String karar;
		System.out.print("----------------< EKMEK HESAPLAMASI >----------------\n"
				+ "Hangi isletmeden ekmek almak istiyorsunuz?\nBakkal icin B\t-----\tSupermarket icin S : ");
		Scanner kararYaz = new Scanner(System.in);
		karar = kararYaz.next();
		switch(karar) {
		case "S":
			MusteriTercihi musteriTercihi = new MusteriTercihi();
			musteriTercihi.ekmekfiyatikarsilastirmasi = new SuperMarketFiyati();
			musteriTercihi.EkmekAlisverisiYap();
			break;
		case "B":
			MusteriTercihi musteriTercih = new MusteriTercihi();
			musteriTercih.ekmekfiyatikarsilastirmasi = new Bakkal();
			musteriTercih.EkmekAlisverisiYap();
			break;
			default:
				System.out.print("Tanimsiz Deger Girisi Gerceklestirdiniz!");
			}			
		}
	}
}
