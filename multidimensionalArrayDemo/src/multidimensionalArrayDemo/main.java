package multidimensionalArrayDemo;

public class main {

	public static void main(String[] args) {
		String city; 									//tek başına bir string
		String[] sehir;  								//tek satırdan oluşan bir array
		String[][] sehirler= new String[3][3];			//üç bölgeden ve 3 şehirden oluşan bir dizi

		sehirler[0][0]="istanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakır";
		sehirler[2][1]="Şanlıurfa";
		sehirler[2][2]="Gaziantep";
		
		//bu şehirleri bölge olarak yazdıracağız bunun için döngü kullanıyorum
		//nested loop var
		
		for(int i=0; i<=2;i++) {
			System.out.println("------------");
			for (int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
				
				}
			}
			
			
		}
		
		
		
		
		
		
		
	}


