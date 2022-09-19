package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'ü';
		if(harf=='q' || harf =='Q' || harf=='w' || harf=='W' || harf=='x' || harf=='X') {
			System.out.println("Geçersiz harf"); return;
		}
		
		char[] liste = {'a','e','ı','i','o','ö','u','ü','A','E','I','İ','O','Ö','U','Ü'};
		
		for(int i = 0;i<liste.length;i++) {
			if(liste[i]==harf) {
				System.out.println(harf+" harfi sesli harftir.");
				return;
			}
		}
		System.out.println(harf+" harfi sessiz harftir.");
			
		

	}

}
