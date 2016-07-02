
public class PolimorfizmOrnek2 {
	public static Hayvan rasgelesec(){
			int sec = ((int) (Math.random()*3));
			Hayvan h = null;
			if(sec==0) h = new Hayvan();
			if(sec==1) h = new Kartal();
			if(sec==2) h = new Timsak();
			return h;
	}
	
	public static void main(String args[]){
		Hayvan[] h = new Hayvan[3];
		for(int i=0; i<3; i++){
			h[i] = rasgelesec();
		}
		
		for(int j=0; j<3; j++){
			h[j].avYakala();
		}
	} 
}
