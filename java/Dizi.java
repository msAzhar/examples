import java.util.*;
public class Dizi{
public static void main(String[] args){
String[] dizi=new String[3];
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++){
System.out.println((i+1)+"isim giriniz:");
dizi[i]=s.nextLine();
}
yazdir(dizi);
}

static void yazdir(String dizi[]){
System.out.println("isimler:");
for(String i: dizi)
System.out.println(i);
}

}
