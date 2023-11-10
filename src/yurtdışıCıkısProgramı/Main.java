package yurtdýþýCýkýsProgramý;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// YURT DIÞINA ÇIKMAK ÝÇÝN KURALLAR OLUCAK(BELGE )ONLAR TAM OLURSA ÇIKABÝLECEK
		System.out.println("Sabiha Gökçen Havaalanýna Hoþgeldiniz...");
		
		String þartlar= "Yurt Dýþý Çýkýþ Kurallarý:\n"
				       + "Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekir...\n"
				       + "15 TL harç ücretini tam yatýrmanýz gerekiyor...\n"
				       + "Gideceðiniz yere vizenizin olmasý gerekir...";
		String message ="Yurtdýþýna çýkmak için bütün kurallara uymanýz gerekiyor...";
		
		while(true) {
			System.out.println("***********************");
			System.out.println(message);
			System.out.println("**************************");
			System.out.println(þartlar);
			System.out.println("***************************");
			
			Yolcu yolcu1 = new Yolcu();
			
			System.out.println("***************************");
			System.out.println("Harç kontrol yapýlýyor...");
			Thread.sleep(3000);//PROGRAMI 3 SANÝYE BEKLETTÝK
			
			 if(yolcu1.yurtDisiHarciKontrol()== false) { //METODU ÇAGIRDIK VE KONTROL ETTÝK
				 System.out.println(message);
				 continue; //FALSE EÞÝT ÝSE BAÞA DÖNECEK
			 }
			 
			 System.out.println("****************************");
			 System.out.println("Siyasi yasak kontrol ediliyor...");
			 Thread.sleep(3000);
			 
			 if(yolcu1.siyasiYasakKontrol()==false) {
				 System.out.println(message);
				 continue; //BAÞA DÖNER
			 }
			 
			 System.out.println("******************************");
			 System.out.println("Vize durumu kontrol ediliyor...");
			 Thread.sleep(3000);
			 
			 if(yolcu1.vizeDurumuKontrol()==false) {
				 System.out.println(message);
				 continue;
			 }
			 System.out.println("Ýþlemleriniz tamam!Çýkabilirsiniz...");
			 break;
		}

	}

	}
