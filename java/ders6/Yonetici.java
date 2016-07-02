
class Yonetici implements Calisan {
	double ucret;
	public void bolumYazdir(){
		System.out.println("Yönetici");
	}
	
	public void ucretBelirle(double ucret){
		this.ucret=ucret;;
	}
	
	public  double ucret() {
		return this.ucret;
	}
		
}
