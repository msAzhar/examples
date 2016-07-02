
public class ddrtgn2 {
	private double en;
	private double boy;
	
	public double dAlan(){
		return en*boy;
	}
	
	public double getEn(){
		return en;
	}
	
	public void setEn(double x){
		if(x<0){ 
			en=0;
			}else{
			en=x;
			}
	}
	
	public double getBoy(){
		return boy;
	}
	
	public void setBoy(double boy){
		if(boy<0){ 
			this.boy=0;
			}else{
				this.boy=boy;
			}
	}
}
