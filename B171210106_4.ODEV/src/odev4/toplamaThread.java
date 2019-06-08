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
public class toplamaThread implements Runnable{
    int toplam = 0;
    int [] sayilar;
    public toplamaThread(int [] sayilar){
        this.sayilar = new int[sayilar.length];
        System.arraycopy(sayilar, 0, this.sayilar, 0, sayilar.length);
    }
    void topla(int [] sayilar){
     for (int i = 0; i < sayilar.length; i++) {
            toplam +=sayilar[i];
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < sayilar.length; i++) {
            toplam +=sayilar[i];
        }
    }
    
}
