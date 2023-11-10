package yurtdýþýCýkýsProgramý;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallarý{
	private double harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Ne kadar harç ücreti yatýrdýnýz?: ");
		this.harc=scan.nextDouble();
		
		scan.nextLine();
		
		System.out.print("Siyasi yasaðýnýz bulunuyor mu?(evet yada hayýr): ");
		String cevap= scan.nextLine();
		if(cevap.equals("evet")) {
			this.siyasiYasak=true;
		}else {
			this.siyasiYasak=false;	
			}
		
		System.out.print("Vizeniz bulunuyor mu?(evet yada hayýr): ");
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
			System.out.println("Yurtdýþý harcýný tam yatýrýnýz...");
			return false;
		}else {
			System.out.println("Yurtdýþý yatýrma iþleminiz baþarýyla tamamlandý.");
			return true;
		}
	}

	@Override
	public boolean siyasiYasakKontrol() {
	   if(this.siyasiYasak == true) {
		   System.out.println("Siyasi yasaðýnýz bulunuyor.Çýkýþ yapamazsýnýz...");
		   return false;
	   }else {
		   System.out.println("Siyasi yasaðýnýz bulunmuyor.");
		   return true;
	   }
	
	}

	@Override
	public boolean vizeDurumuKontrol() {
	   if(this.vizeDurumu==true) {
		   System.out.println("Vize iþlemleri baþarýyla tamamlandý...");
		   return true;
	   }else {
		   System.out.println();
		   return false;
	   }
	
	}

	

}
