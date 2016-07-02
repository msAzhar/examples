
public class ddrtgn3 {
 private double en;
 private double boy;
 public double dAlan(){
	 return en*boy;
 }
 
 public ddrtgn3(){
	 //parametresiz yapilandirici
 }
 
 public ddrtgn3(double x, double boy){
	setEn(x);
	setBoy(boy);
 }
 
 	public double getEn(){
		 return en;
	 }
 
	 public void setEn(double x){
		en=x;
	 }
	 public double getBoy(){
		 return boy;
	 }
	 public void setBoy(double y){
		 boy=y;
	 }
}
