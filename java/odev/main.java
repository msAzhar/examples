
public class main {
	public static void main(String args[]){
		kutu1 k1 = new kutu1();
		kutu1 k2 = new kutu1();
		// k1 degerleri
		k1.x = 3.0; k1.y = 4.0; k1.z = 5.0;
		// k2 degerleri
		k2.x = 5.0; k2.y = 6.0; k2.z = 7.0;
		// k1 in hacmini yazdiriyoruz
		System.out.println("K1 in hacmi: " + (k1.x*k1.y*k1.z));
		// k2 nin hacmini yazdiriyoruz
		System.out.println("K2 nin hacmi: "+ (k2.x*k2.y*k2.z));
		
		
	}
}