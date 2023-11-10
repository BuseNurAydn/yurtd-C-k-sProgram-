package yurtd���C�k�sProgram�;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallar�{
	private double harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Ne kadar har� �creti yat�rd�n�z?: ");
		this.harc=scan.nextDouble();
		
		scan.nextLine();
		
		System.out.print("Siyasi yasa��n�z bulunuyor mu?(evet yada hay�r): ");
		String cevap= scan.nextLine();
		if(cevap.equals("evet")) {
			this.siyasiYasak=true;
		}else {
			this.siyasiYasak=false;	
			}
		
		System.out.print("Vizeniz bulunuyor mu?(evet yada hay�r): ");
		String cevap2= scan.nextLine();
		if(cevap2.equals("evet")) {
			this.vizeDurumu=true;
		}else {
			this.vizeDurumu=false;
		}
			
		}
		
	

	@Override
	public boolean yurtDisiHarciKontrol() {
		if(this.harc < 15) {
			System.out.println("Yurtd��� harc�n� tam yat�r�n�z...");
			return false;
		}else {
			System.out.println("Yurtd��� yat�rma i�leminiz ba�ar�yla tamamland�.");
			return true;
		}
	}

	@Override
	public boolean siyasiYasakKontrol() {
	   if(this.siyasiYasak == true) {
		   System.out.println("Siyasi yasa��n�z bulunuyor.��k�� yapamazs�n�z...");
		   return false;
	   }else {
		   System.out.println("Siyasi yasa��n�z bulunmuyor.");
		   return true;
	   }
	
	}

	@Override
	public boolean vizeDurumuKontrol() {
	   if(this.vizeDurumu==true) {
		   System.out.println("Vize i�lemleri ba�ar�yla tamamland�...");
		   return true;
	   }else {
		   System.out.println();
		   return false;
	   }
	
	}

	

}
