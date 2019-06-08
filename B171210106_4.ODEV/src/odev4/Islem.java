/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;

/**
 *
 * @author mert
 */
public class Islem {
    int [] birler; 
    int [] onlar; 
    int [] yüzler;
    int [] binler;
    public Islem(int sayac,String [] satirlar){
    birler = new int[sayac];
    onlar = new int[sayac];    
    yüzler = new int[sayac];
    binler = new int[sayac];
    
    for (int j = 0; j < sayac; j++) {
            int sayi = Integer.valueOf(satirlar[j]);
            /////
            binler[j] = sayi/1000;
            sayi = sayi-binler[j]*1000;
            /////
            yüzler[j] = sayi/100;
            sayi = sayi-yüzler[j]*100;
            /////
            onlar[j] = sayi/10;            
            sayi = sayi-onlar[j]*10;
            ////
            birler[j] = sayi;
            ////
            //System.out.println(binler[j]);            
        }
    }
    
}
