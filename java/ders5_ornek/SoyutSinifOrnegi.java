
public class SoyutSinifOrnegi {
	public static void main(String[] args){
		daire d = new daire(6.0);
		double alan = d.alanHesap();
		System.out.println(d.isimGetir());
		System.out.println("Alanı:" + alan);
	}

}
