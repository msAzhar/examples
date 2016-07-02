
public class Insan {
	public Insan(int par){
		System.out.println("İnsan Yapılandırıcısı " + par);
	}
}
class ZekiInsan extends Insan {
	public ZekiInsan(int par){
		super(par+1);
		System.out.println("Zeki İnsan Yapılandırıcısı " + par);
	}
}
class Hacker extends ZekiInsan {
	public Hacker(int par){
		super(par+1);
		System.out.println("Hacker Yapılandırıcısı " + par);
	}
	public static void main(String[] args){
		Hacker hk = new Hacker(5);
	}
}