/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Khalilullah Nuraini
 */
public class Jabatan extends Identitas {
    int gaji = 1_500_000;
    int bonus = gaji * 2;
    
    public void nama () {
        System.out.println("Nama Pegawai \t : " + super.nama);
    }
    public void gender () {
        System.out.println("Jenis Kelamin \t : " + super.jenisK);
    }
    public void posisi () {
        System.out.println("In charge of Departmenet of Marketing and Salary");
    }
    public void gaji () {
        System.out.println("Gaji Utama Pegawai \t :" + this.gaji);
    }
    public void bonus () { 
        System.out.println("Gaji Bonus Pegawai \t :" + this.bonus);
    }
}
