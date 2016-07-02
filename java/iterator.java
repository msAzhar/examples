import java.util.*;
public class iterator{
public static void main(String[] args){
HashSet<String>hs=new HashSet<String>();
hs.add("Diyarbakır");
hs.add("Bursa");
hs.add("ali");
hs.add("amir");
hs.add("Şeyma");
Iterator i=hs.iterator();
while(i.hasNext()){
System.out.println("Kume elemanı:"+i.next());
i.remove();
}
System.out.println("Elemanlar silindi");
System.out.println(hs);

}


}
