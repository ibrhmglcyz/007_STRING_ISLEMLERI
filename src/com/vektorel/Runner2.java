package com.vektorel;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
				
				// Kullanicidan adini alan ve bir dik ucgen seklinde
				// yazdiran kodu yaziniz.
				
				// ahmet
				//
				// a
				// ah
				// ahm
				// ahme
				// ahmet
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Adinizi giriniz..: ");
				String ad = sc.nextLine();
				
				for (int i = 0; i <= ad.length(); i++) {
					System.out.println(ad.substring(0, i));
				}

	}

}
