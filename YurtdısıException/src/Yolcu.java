import java.util.Scanner;


class SiyasiException extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("Siyasi Yasağınız Bulunuyor..");
	}

}
class VizeException extends Exception {

	@Override
	public void printStackTrace() {

	System.out.println("Gideceğiniz Yere Vize Yasağınız Bulunuyor..");
		
	}
	
}
class HarcException extends Exception {

	@Override
	public void printStackTrace() {
		
		System.out.println("Lütfen Yurtdışı Harcını Tam Yatırın ...");
	}
	
	
	
}

public class Yolcu  {

	private int harc_kontrol ;
	private boolean sıyası_yasak_kontrol ;
	private boolean vıze_durumu_kontrol;
	
	
	public Yolcu() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yatırdığınız Harç Bedeli : " );
		this.harc_kontrol= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Herhangi bir Siyasi Yasağınız Bulunuyor mu ? :");
		
		String cevap = scanner.nextLine();
		 
		if(cevap.equals("evet")) {
			this.sıyası_yasak_kontrol = true ;
		}
		else if(cevap.equals("hayır")) {
			
			this.sıyası_yasak_kontrol=false ;
			
			
		}
		else {
			System.out.println("Yanlış cevap Verdiniz... ");
		}
		System.out.println("Vizeniz Bulunuyor mU ? ");
		String cevap2 = scanner.nextLine();
		
		if(cevap2.equals("evet")) {
			this.vıze_durumu_kontrol = true ;
		}
		else {
			this.vıze_durumu_kontrol = false ;
		}
		
	}
	
	
	
	public void yurtdısı_harcı() throws HarcException {
		
		if(this.harc_kontrol<15) {
			
			throw new HarcException() ;
			
		}
		else {
			
			
		}
		
		
	}
	
	public void sıyası_yasak() throws SiyasiException {
		
		if(this.sıyası_yasak_kontrol == true) {
			
			throw new SiyasiException() ;
			
		}
		else {
			
		}
		
	}
	
	public void vıze_durumu() throws VizeException {
		
		if(this.vıze_durumu_kontrol == true) {
			
			System.out.println("Vize İşlemleri tamam ..");
		
			
			
		}
		else {
			throw new VizeException();
			
		}
		
			
		
		
	}
	
	
	
	
}
