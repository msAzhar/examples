public class dizi2{
public static void main(String[] args){
int k[][]=new int[3][];
k[0]= new int[2];
k[1]= new int[1];
k[2]= new int[3];

k[0][0]=89;
k[0][1]=32;
k[1][0]=5;
//k[1][1]=3;
k[2][0]=65;
k[2][1]=78;
k[2][2]=49;
for(int i=0;i<k.length;i++){
for(int j=0;j<i;j++){
System.out.println("iki boyutlu dizimi:"+k[i][j]);
}
}
}//main
}//classı kapattık
