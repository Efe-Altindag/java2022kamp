package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 23;
		if(sayi<2){
			System.out.println("Geçersiz sayı.");
			return;
		}
		int index = 0;
		for(double i = 1;i<=sayi;i++) {
			for(int a=1;a<=sayi;a++) {
				if(sayi/i==a) {	
				index++;
				}
			}
		}

		if(index==2) {
			System.out.println(sayi+" sayısı asaldır.");
		}
		else {
			System.out.println(sayi+" sayısı asal değildir.");
		}
		
	}

}