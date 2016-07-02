import java.util.*;
public class linkedlist{
public static void main(String[] args){
LinkedList<String>hs=new LinkedList<String>();
hs.add("Diyarbakır");
hs.add("Bursa");
hs.add("ali");
hs.add("amir");
hs.add("Şeyma");
System.out.println("İlk liste:"+hs);
hs.add("EklenenAyse");
System.out.println("Değişken liste:"+hs);
System.out.println("İlk öğe:"+hs.getFirst());
System.out.println("4. öğe:"+hs.get(4));
System.out.println("Silinen öğe:"+hs.removeFirst());
System.out.println("Silinen öğe:"+hs.removeLast());
System.out.println("Listenin son hali:"+hs);


}


}
