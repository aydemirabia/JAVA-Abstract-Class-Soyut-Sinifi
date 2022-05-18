package abstract_sinifi_java;

import abstract_sinifi_java.EkmekFiyatiKarsilastirmasi;

public class SuperMarketFiyati extends EkmekFiyatiKarsilastirmasi {
	@Override
	double ekmekAl(int ekmekNeKadar) {
		return ekmekNeKadar * 2.5;
	}
}
