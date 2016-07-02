
public class Calistir {
 public static void main(String[] args){
	 Kare n = new Kare();
	 n.alan();
	 Dikdortgen d = new Kare(); // Burası bir Polimorfizm örneğidir
	 d.alan();
/*   Kare d = new Dikdortgen(); olarak Kare ve Dikdortgen yerlerini
*  değiştirirsek, Cannot convert from Dikdortgen to Kare hatasını alırız.
*  Bunun için DownCasting yapmalıyız,aşağıdaki gibi:
*/
	 // Kare n1= (Kare)new Dikdortgen();
	 //Kare n2 = (Kare)n1;
	 //Fakat, bu da problemi çözemez. Yani program yine de çalışmaz.
 }
}
