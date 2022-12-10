package com.mycompany.huffmanodev;
import static com.mycompany.huffmanodev.Sorting.sortByBubbleSort;
import static com.mycompany.huffmanodev.Sorting.sortBySelectionSort;
import java.util.HashMap;

public class Olaylar {
    HarfAdetBulucu f= new HarfAdetBulucu();
    
    public void gonder(String metin){
        HashMap<String, String> deger = new HashMap<String, String>();

        String[] harfler= new String[4];
        int[] sayilar= new int[4];
        
//harflerden kaç tane olduğunu buluyoruz.
        harfler[0]="a";
        sayilar[0]=f.a_sayisi(metin);
        harfler[1]="b";
        sayilar[1]=f.b_sayisi(metin);
        harfler[2]="c";
        sayilar[2]=f.c_sayisi(metin);
        harfler[3]="d";
        sayilar[3]=f.d_sayisi(metin);

//sıralama algoritmaları ile önce hangi harften kaç tane varsa onları sonra harfleri sıraladık
        sortBySelectionSort(sayilar);
        sortByBubbleSort(harfler,sayilar);
        
//harfleri sıraladıktan sonra bu harflere değerler atıyoruz.
        deger.put(harfler[0], "00");
        deger.put(harfler[1], "01");
        deger.put(harfler[2], "10");
        deger.put(harfler[3], "11");
      
        
//çıktı alma satırları
      for(int i=0;i<metin.length();i++){
          System.out.print(metin.subSequence(i, i+1)+"  ");
          
      }
      System.out.println("" );
      for(int i=0;i<metin.length();i++){
          System.out.print(deger.get(metin.subSequence(i,i+1))+" "); 
      }  
    }
}

//ihsan arslan
//02210201520
 