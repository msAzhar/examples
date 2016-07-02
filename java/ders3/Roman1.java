
public class Roman1 extends Kitap {
	public static void main(String args[]){
		Roman1 r1 = new Roman1();
		int sayfasayisi = r1.sayfasayisiOgren();
		double fiyat = r1.fiyatOgren();
		String yazar = r1.yazarOgren();
		
		System.out.println(sayfasayisi);
		System.out.println(fiyat);
		System.out.println(yazar);
	}
}
