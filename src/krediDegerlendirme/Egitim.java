package krediDegerlendirme;

public class Egitim {
	
	public static String[][] veri() {
		String veri[][]=new String[][] {
			{"Borç",	"Egitim",		"Gelir",	"Sonuc"},
			{"yüksek",	"ilk",			"düþük",	"hayýr"},
			{"yüksek",	"orta",			"orta",		"hayýr"},
			{"yüksek",	"üniversite",	"yüksek",	"evet"},
			{"düþük",	"lise",			"orta",		"evet"},
			{"düþük",	"üniversite",	"yüksek",	"evet"},
			{"düþük",	"lise",			"yüksek",	"evet"},
			{"düþük",	"ilk",			"düþük",	"hayýr"},
			{"düþük",	"ilk",			"orta",		"hayýr"},
			{"düþük",	"orta",			"orta",		"hayýr"},
			{"düþük",	"üniversite",	"orta",		"evet"},
			{"düþük",	"üniversite",	"orta",		"hayýr"},

		};
		return veri;
}

	

}
