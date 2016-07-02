
public class arayuzOrnek {
public static void main(String args[]){
	Isci i = new Isci();
//	Yonetici y = new Yonetici();
//	Pazarlamaci p = new Pazarlamaci();
	i.bolumYazdir();
	i.ucretBelirle(5.0);
	System.out.println("İşçi ücreti:" + i.ucret());
}
}
