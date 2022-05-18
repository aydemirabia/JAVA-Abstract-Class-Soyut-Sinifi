package abstract_sinifi_java;

import abstract_sinifi_java.EkmekFiyatiKarsilastirmasi;

public class Bakkal extends EkmekFiyatiKarsilastirmasi{
	@Override
	double ekmekAl(int ekmekNeKadar) {
		return ekmekNeKadar * 1.75;
	}
}
