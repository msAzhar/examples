public class fact{
static int faktoriyel(int sayi){
if(sayi==1)
	return 1;
else
	return (sayi*(faktoriyel(sayi-1)));
}
public static void main(String[] args){
System.out.println(faktoriyel(5));
}


}
