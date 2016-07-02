import java.util.Objects;


public class Calistir {
	public static void mesaibasla(Object[] o){
		for(int i=0;i<o.length;i++){
			if(o[i] instanceof Calisan){
				Calisan c = new Calisan();
				c.calis();
			}
			else if(o[i] instanceof Mudur){
				Mudur m = new Mudur();
				m.calis();
			}
			else if(o[i] instanceof Programci){
				Programci pr = new Programci();
				pr.calis();
			} 
			else if(o[i] instanceof Pazarlayici){
				Pazarlayici pz = new Pazarlayici();
				pz.calis();
			}else{
				System.out.println("Calışan değil");
			}
		}
	}
 public static void main(String args[]){
	 Object[] o = new Object[4];
	 o[0]=new Calisan();
	 o[1]=new Programci();
	 o[2]=new Pazarlayici();
	 o[3]=new Mudur();
	 mesaibasla(o);
 }
}
