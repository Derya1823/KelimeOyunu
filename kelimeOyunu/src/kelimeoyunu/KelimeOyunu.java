package kelimeoyunu;
import java.io.IOException;
import java.util.Scanner;

public class KelimeOyunu {
    
    public static void main(String[] args) throws IOException {
      Scanner input=new Scanner(System.in);
      System.out.println("************** Kelime oyununa hoşgeldiniz ***************");
      String kelime="bilimkurgu";
      int uzunluk=kelime.length(),dogru=0,yanlis=0;
      boolean durum=false, cikis=false,bulunan=false;
      char harfler[]=new char[uzunluk];
      char harf;
      while(durum==false){
      System.out.println("Gelecek çağları gelişme veya gerileme ekseninde ele alan, varsayımlardan ve hayal gücünden yararlanan eser");
      for(int i=0; i<uzunluk; i++){
        if(harfler[i]==kelime.charAt(i))
              System.out.print(harfler[i]);
        else
            System.out.print("_ ");
      }
      System.out.print(":");
      harf = input.next().charAt(0);
      for(int j=0;j<uzunluk;j++){
      if(harfler[j]==harf)
          cikis=true;}
      if(cikis==false){
      for(int k=0;k<uzunluk;k++){
      if(kelime.charAt(k)==harf){
          harfler[k]=harf;
          bulunan=true;
          dogru++;}}}
      if(cikis)
          System.out.println(harf +" harfi zaten kelimede var");
      else if(bulunan==false){
          System.out.println(harf + " harfi kelimede bulunmamaktadır");
          yanlis++;
      System.out.println("(Kalan tahmin hakkınız:"+(10-yanlis)+")");}
      if(dogru==uzunluk){
      cikis=false;
      bulunan=false;}
    }
    }
}

