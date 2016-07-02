
public class daire extends geometrikSekil{
public double r; //yaricap
public double pi=3.15;

public daire(double r){
	isimBelirle("DaireAlanı");
	this.r=r;
}
public double alanHesap(){
	return 2*pi*r*r;
}
}
