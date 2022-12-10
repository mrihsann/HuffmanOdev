package com.mycompany.huffmanodev;
public class HarfAdetBulucu {
//harflerin kaç defa tekrar ettiğini bulmak için aşağıda ki fonksiyonları yazdık.
    
//a harfinin kaç defa tekrar ettiğini buluyoruz.
    public int a_sayisi(String metin) {
        
        char karakter = 'a';
        int adet = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                adet+=1;
            }
        }
        return adet;
    }
 //b harfinin kaç defa tekrar ettiğini buluyoruz.
    public int b_sayisi(String metin) {
        
        char karakter = 'b';
        int adet = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                adet+=1;
            }
        }
       
        return adet;
    }
 //c harfinin kaç defa tekrar ettiğini buluyoruz.
    public int c_sayisi(String metin) {
        
        char karakter = 'c';
        int adet = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                adet+=1;
            }
        }
        return adet;
    }
 //d harfinin kaç defa tekrar ettiğini buluyoruz.
    public int d_sayisi(String metin) {
        
        char karakter = 'd';
        int adet = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                adet+=1;
            }
        }
        return adet;
    }
}    


//ihsan arslan
//02210201520