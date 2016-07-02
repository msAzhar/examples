
public class PolimorfizmOrnek1 {
	public static void hazirOl(Asker a){
		a.selamVer();
	}
	
	public static void main(String args[]){
		Asker a = new Asker();
		Asker e = new Er(); //Er e= new er(); de diyebiliriz.
		Yuzbasi y = new Yuzbasi();
		hazirOl(a);
		hazirOl(e);
		hazirOl(y);
	}
}
