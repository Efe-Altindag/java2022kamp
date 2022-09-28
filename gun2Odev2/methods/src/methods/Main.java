package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[]{1,2,8,9,112,124,23,15,5};
		int aranacak = 15;
		
		for(int i=0;i<sayilar.length;i++)//for(int sayi:sayilar)
			{
			if(sayilar[i]==aranacak) {
				int a=i+1;
				mesajVer(aranacak+" sayısı bulundu."+a+". sırada");
				return;
			}
		}
		mesajVer("sayı yok");
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

