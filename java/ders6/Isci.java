
class Isci implements Calisan {
	double ucret;
	public void bolumYazdir(){
		System.out.println("İşçi");
	}
	
	public void ucretBelirle(double ucret){
		this.ucret=ucret;;
	}
	
	public  double ucret() {
		return ucret*CALISANSABITI;
	}
	
	public void komBelirle(int a){
	
	}
	
	
}
