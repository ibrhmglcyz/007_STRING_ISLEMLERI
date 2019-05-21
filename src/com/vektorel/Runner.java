package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		
		String ifade = "Bu gun hava cok soguk";
		
		System.out.println(ifade.charAt(4)); // Bir string icinde verilen index numarasina ait karakteri doner.
		
		System.out.println(ifade.compareTo("Bu gun hava cok soguk"));

		System.out.println(ifade.concat(". Gercekten mi?")); // Mevcut degiskene baska bir string ifadeyi eklemek icin kullanilir.
		System.out.println(ifade+". Gercekten mi?");
		
		System.out.println(ifade.contains("cok")); // Mevcut deger icinde aranilan string ifadenin olup olmadigini irdeler ve true/false degeri doner.
		
		System.out.println(ifade.equals("Bu gun hava cok soguk")); // Iki string ifadenin bir birine esit olup olmadigini dogrular. true/false deger doner.
		
		// string icinde istenilen karakterin bulundugu index numarasini doner
		System.out.println(ifade.indexOf('a'));//8
		System.out.println(ifade.indexOf("h"));//7
		System.out.println(ifade.indexOf("cok"));//12
		System.out.println(ifade.lastIndexOf('a'));//10
		System.out.println(ifade.indexOf('5'));//-1
		// String degiskeninin bos olup olmadigina bakar.
		
		String telefon = "0 555 666 9999";
		// String ifadenin bos olup olmadigini irdeler true/false degeri doner
		boolean bosmu = telefon.isEmpty();
		if(bosmu)
			System.out.println("Telefon Bos Gecilemez");
	
		
		System.out.println("Girilen Metin uzunlugu..: " +ifade.length()); // String ifadenin karakter uzunlugunu verir
		
		
		ifade = "Suan hava cok soguk";
		// Bir string icindeki istenilen karakterleri baska bir karakter ile degistirmede kullanilir.
		System.out.println(ifade.replace('s', 'S').replace(' ', '-').replace('c', 'C').replace('G', 'g'));
		
		
		ifade = "Ahmet,Ali,Hasan,Ayse,Banu,Bahar,Tuba";
		System.out.println(ifade.split(",")[3]); // String ifadesi icinde belli bir karaktere gore ayristirma yaparak string dizisi olusturur.
		
		
		System.out.println(ifade.substring(16, ifade.length())); // Strig bir ifade icinde istenilen index araliginda degerleri almak icin kullanilir.

		ifade = "hava cok sicak";
		ifade = "hava CoK sIcak";
		ifade = "hava cOK sicak";
		
		System.out.println(ifade.toLowerCase()); // String ifadenin tum karakterlerini kucuk harfe cevirir
		
		System.out.println(ifade.toUpperCase()); //String ifadenin tum karakterlerini buyuk harfe cevirir
		
		System.out.println(ifade.toLowerCase().contains("Cok"));
		
		ifade = "  ifadede bosluklar var       ";
		System.out.println(ifade.trim()); // String degiskenini basnida ve sonunda bulunan tum bosluklari siler.
		
		String sifre = "     ";
		String ks = "  ahmet222";
		if(sifre.trim().isEmpty()) 
			System.out.println("Sifre Bos Gecilemez");
		
		if(ks.trim().equals("ahmet222"))
			System.out.println("sisteme girdiniz.");
		else
			System.out.println("Sifreniz hatali");

	} //METHOD SONU

} //CLASS SONU
