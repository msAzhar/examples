class Kutu{
	int i=0;
}

public class FinalOrnek {
	final int X_SABIT_DEGER = 34;
	final static int Y_SABIT_DEGER = 35;
	final int A = (int)(Math.random()*50);
	final Kutu k = new Kutu();
	
	public static void main(String args[]){
		FinalOrnek fo = new FinalOrnek();
		
		//fo.X_SABIT_DEGER=15; HATA!!!
		//fo.Y_SABIT_DEGER=16; HATA!!! 
		//fo.A=17;			   HATA!!!
		
		fo.k.i = 35; //doğrudur
		
		//fo.k = new Kutu();   HATA!!!
		
		System.out.println("x Sabiti =" + fo.X_SABIT_DEGER);
		System.out.println("Y Sabiti =" + fo.Y_SABIT_DEGER);
		System.out.println("A Sabiti =" + fo.A); // Her çalışmasında değişen değerdir.
		System.out.println("Kutu.i =" + fo.k.i);
	}
}
