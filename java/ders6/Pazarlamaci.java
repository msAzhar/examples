
class Pazarlamaci implements PazarlamaKom {
	double komisyon;
	double ucret;
	public void bolumYazdir(){
		System.out.println("Pazarlamacı");
	}
	
	public void ucretBelirle(double ucret){
		this.ucret=ucret;
	}
	
	public  double ucret() {
		return this.ucret*CALISANSABITI+komisyon;
	}
	
	public void komBelirle(int adet){
		this.komisyon= KOMSABITI*adet;
	}
	
	
}
