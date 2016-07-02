import java.util.*;
public class hashset{
public static void main(String[] args){
HashSet<String>hs=new HashSet<String>();
hs.add("Diyarbakır");
hs.add("Bursa");
hs.add("ali");
hs.add("amir");
hs.add("Şeyma");
System.out.println("Liste");
System.out.println(hs);
TreeSet<String>sirali=new TreeSet<String>(hs);
System.out.println(sirali);
}


}
