
public class Roman2 extends Kitap {
	
	 public int sayfasayisiOgren(){
		 System.out.println("Roman2 - Sayfa Sayısı Öğren");
		 return 596;
	 }
	 
	 public double fiyatOgren(){
		 System.out.println("Roman2 - Fiyat Öğren");
		 return 85.000000;
	 }
	 
	 
//	 public String yazarOgren(){
	//	 System.out.println("Roman2 - Yazarı Öğren");
		// return "yz";
	 //}
	
	public static void main(String args[]){
		Roman2 r2 = new Roman2();
		int sayfasayisi = r2.sayfasayisiOgren();
		double fiyat = r2.fiyatOgren();
		String yazar = r2.yazarOgren();
		
		System.out.println(sayfasayisi);
		System.out.println(fiyat);
		System.out.println(yazar);
	}
}
