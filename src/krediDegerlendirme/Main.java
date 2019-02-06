package krediDegerlendirme;

import java.util.Scanner;

public class Main {
	
	public static String[][] degerlendirme=Egitim.veri();
	
	public static String inGelir,inEgitim,inBorc;
	
	public static double[][] degerler= {
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
	};

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("(ilk-orta-lise-üniversite)");
		System.out.print("Egitim: ");
		inEgitim=input.next();
		System.out.println("(düþük-yüksek-orta)");
		System.out.print("Gelir: ");
		inGelir=input.next();
		System.out.println("(düþük-yüksek)");
		System.out.print("Borc: ");
		inBorc=input.next();
		
		
		KrediSonuc(inEgitim,inGelir,inBorc);
	}
	
	public static void KrediSonuc(String egitim,String gelir, String borc) {
		
		for(int i=1;i<degerlendirme.length;i++) {
			if(degerlendirme[i][0].equals(borc)) {
				degerler[0][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[0][1]++;

				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[0][2]++;

				}
			}
			
			if(degerlendirme[i][1].equals(egitim)) {
				degerler[1][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[1][1]++;

				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[1][2]++;

				}
			}
			
			if(degerlendirme[i][2].equals(gelir)) {
				degerler[2][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[2][1]++;

				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[2][2]++;

				}
			}
			
			if(degerlendirme[i][1].equals(egitim) && degerlendirme[i][0].equals(borc)) {
				degerler[3][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[3][1]++;

				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[3][2]++;

				}
			}
			
			if(degerlendirme[i][2].equals(gelir) && degerlendirme[i][0].equals(borc)) {
				degerler[4][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[4][1]++;

				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[4][2]++;

				}
			}
			
			if(degerlendirme[i][2].equals(gelir) && degerlendirme[i][1].equals(egitim)) {
				degerler[5][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[5][1]++;

				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[5][2]++;

				}
			}
			
			if(degerlendirme[i][2].equals(gelir) && degerlendirme[i][1].equals(egitim) && degerlendirme[i][0].equals(borc)) {
				degerler[6][0]++;
				if(degerlendirme[i][3]=="evet") {
					degerler[6][1]++;
				}
				else if(degerlendirme[i][3]=="hayýr") {
					degerler[6][2]++;

				}
			}
		}
		
		Sonuc();
		
	}
	
	public static void  Sonuc() {
		
		double bestevet=0,besthayýr=0;
		
		double bir;
		
		for(int i=0;i<degerler.length;i++) {
			if(degerler[i][0]!=0) {
				degerler[i][3]=((degerler[i][1]/degerler[i][0])*100);
				degerler[i][4]=(degerler[i][2]/degerler[i][0])*100;
				System.out.println(degerler[i][0]+"-"+degerler[i][1]+"-"+degerler[i][2]+"-"+degerler[i][3]+"-"+degerler[i][4]);
					if(degerler[i][3]>bestevet) {
						bestevet=degerler[i][3];
						besthayýr=degerler[i][4];
					}
			}
		}
		
		if(bestevet==0) {
			System.out.println("evet oraný: "+bestevet);
			System.out.println("hayýr oraný: "+100);
		}else {
			System.out.println("evet oraný: "+bestevet);
			System.out.println("hayýr oraný: "+besthayýr);
		}
		

		
	}

}
