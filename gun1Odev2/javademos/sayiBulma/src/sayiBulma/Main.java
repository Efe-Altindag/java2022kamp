package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,8,9,112,124,23,15,5};
		int aranacak = 15;
		
		for(int i=0;i<sayilar.length;i++)//for(int sayi:sayilar)
			{
			if(sayilar[i]==aranacak) {
				int a=i+1;
				System.out.println(aranacak+" sayısı bulundu."+a+". sırada");
				return;
			}
		}
		System.out.println("sayı yok");
	}

}
