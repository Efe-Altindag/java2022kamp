package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[2][0] = "Konya";
		sehirler[1][1] = "Kayseri";
		sehirler[1][2] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		
		for(int i=0;i<sehirler.length;i++) {
			System.out.println("******");
			for(int a=0;a<sehirler.length;a++) {
				System.out.println(sehirler[i][a]);
			}
		}

	}

}
