
abstract class Sporcu {
public abstract void calis();
public Sporcu(){
	System.out.println("Calis cağrılmadan evvel");
	calis();
	System.out.println("Calis cağrıldıktan sonra");
}

}
