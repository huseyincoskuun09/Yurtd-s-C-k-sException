
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
		
		String sartlar = "YurtDışı Çıkış Kuralları\n"
				       + "Herhangi bir siyasi yasağınız Bulunmaması Gerekiyor...\n"
				       + "15 tl harç bedelinizi tam olarak yatırmanız gerekiyor..\n"
				       + "Gideceğiniz Ülkeye Vizenizin Bulunması Gerekiyor..\n" ;
		String mesaj = "Yurdışı Şartlarından Hepsini Sağlamanız Gerekiyor";
		
		 while(true) {
			 
			 System.out.println("*****************************************");
			
			 System.out.println("*****************************************");
			 System.out.println(sartlar);
			 
			 Yolcu yolcu = new Yolcu();
			 System.out.println("Harç Bedeli Kontrol Ediliyor...");
			 Thread.sleep(3000);
			
			 try {
				yolcu.yurtdısı_harcı();
			} catch (HarcException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				continue ;
			}
			 
			 System.out.println("Siyasi yasak Kontrol ediliyor...");
			 Thread.sleep(3000);
			 
			 try {
				yolcu.sıyası_yasak();
			} catch (SiyasiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue ; 
			}

		 
			 System.out.println("Vize Durumu Kontrol Ediliyor...");
			 Thread.sleep(3000);
			 try {
				yolcu.vıze_durumu();
			} catch (VizeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue ; 
			}
			
			 
			 System.out.println("İşlemleriniz tamam yurtdışına Çıkabilirsiz..");
			 break ;
			 
		 }
				       
		
	}
		
	}

