package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 6;
		int toplam = 0;
		if(sayi<1) {
			System.out.println("Geçersiz sayı");
		}
		
		for(int i=1;i<sayi;i++) {
			if(sayi % i==0) {
				toplam=i+toplam;
			}
		}
		System.out.println(toplam);
		if(toplam==sayi) {
			System.out.println(sayi+" sayısı mükemmel sayıdır");
		}
		else {
			System.out.println(sayi+" sayısı mükemmel sayı değildir");
		}
		
	}

}
