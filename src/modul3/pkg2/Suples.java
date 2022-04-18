/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.pkg2;

/**
 *
 * @author Khalilullah Nuraini
 */
public class Suples extends Superclass{
    String nama = "Anisa";
    int umur = 23;
    
    public void setName(String nama){
        this.nama = nama;
    }
    
    public void cetak() {
        System.out.println("Anak ini punya sifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+umur);
        System.out.println("dengan tinggi badan"+super.TB);
        super.hobbi();
    }
    
}
