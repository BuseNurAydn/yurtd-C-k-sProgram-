package yurtd���C�k�sProgram�;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// YURT DI�INA �IKMAK ���N KURALLAR OLUCAK(BELGE )ONLAR TAM OLURSA �IKAB�LECEK
		System.out.println("Sabiha G�k�en Havaalan�na Ho�geldiniz...");
		
		String �artlar= "Yurt D��� ��k�� Kurallar�:\n"
				       + "Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekir...\n"
				       + "15 TL har� �cretini tam yat�rman�z gerekiyor...\n"
				       + "Gidece�iniz yere vizenizin olmas� gerekir...";
		String message ="Yurtd���na ��kmak i�in b�t�n kurallara uyman�z gerekiyor...";
		
		while(true) {
			System.out.println("***********************");
			System.out.println(message);
			System.out.println("**************************");
			System.out.println(�artlar);
			System.out.println("***************************");
			
			Yolcu yolcu1 = new Yolcu();
			
			System.out.println("***************************");
			System.out.println("Har� kontrol yap�l�yor...");
			Thread.sleep(3000);//PROGRAMI 3 SAN�YE BEKLETT�K
			
			 if(yolcu1.yurtDisiHarciKontrol()== false) { //METODU �AGIRDIK VE KONTROL ETT�K
				 System.out.println(message);
				 continue; //FALSE E��T �SE BA�A D�NECEK
			 }
			 
			 System.out.println("****************************");
			 System.out.println("Siyasi yasak kontrol ediliyor...");
			 Thread.sleep(3000);
			 
			 if(yolcu1.siyasiYasakKontrol()==false) {
				 System.out.println(message);
				 continue; //BA�A D�NER
			 }
			 
			 System.out.println("******************************");
			 System.out.println("Vize durumu kontrol ediliyor...");
			 Thread.sleep(3000);
			 
			 if(yolcu1.vizeDurumuKontrol()==false) {
				 System.out.println(message);
				 continue;
			 }
			 System.out.println("��lemleriniz tamam!��kabilirsiniz...");
			 break;
		}

	}

	}
