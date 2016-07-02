
public class Futbolcu extends Sporcu {
 int antr_sayisi=4;
 public void calis(){
	 System.out.println("Futbolcu calis()" + antr_sayisi);
 }
 public Futbolcu(){
	 System.out.println("Futbolcu yapılandırıcı");
	 calis();
 }
}
