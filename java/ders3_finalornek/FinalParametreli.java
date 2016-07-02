
public class FinalParametreli {
	public static int topla(final int a, final int b){
		//a = 15; HATA!!!
		//b = 9;  HATA!!!
		return a+b;
	}
	public static void main(String args[]){
		if((args.length != 2)){
			System.out.println("Eksik Veri Girilmiştir.");
			System.exit(-1);
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sonuc = FinalParametreli.topla(a, b);
		System.out.println("Sonucu = " + sonuc);
	}
}
