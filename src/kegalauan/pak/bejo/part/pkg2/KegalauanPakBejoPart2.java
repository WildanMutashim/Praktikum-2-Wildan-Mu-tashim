/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauan.pak.bejo.part.pkg2;

/**
 *
 * @author Wildan Mu'tashim
 */
public class KegalauanPakBejoPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Metode Non Void");
        System.out.println("Keramik A");
        MetodeNonVoid A = new MetodeNonVoid();
        A.harga = 54000;
        A.panjang = 30;
        A.lebar = 30;
        A.isi = 10;
        A.luas = 1000000;
        System.out.println("Luas Keramik perbox adalah : " + A.hitungLuasKeramik() + "cm2");
        System.out.println("Bahan yang dibutuhkan adalah: " + A.hitungBahan() + " Box");
        System.out.println("Biaya untuk memasang keramik adalah: " + A.hargaKebutuhan() + " Rupiah\n");
        
        System.out.println("Metode Non Void");
        System.out.println("Keramik B");
        MetodeNonVoid B = new MetodeNonVoid();
        B.harga = 65000;
        B.panjang = 40;
        B.lebar = 40;
        B.isi = 5;
        B.luas = 1000000;
        System.out.println("Luas Keramik perbox adalah : " + B.hitungLuasKeramik() + "cm2");
        System.out.println("Bahan yang dibutuhkan adalah: " + B.hitungBahan() + " Box");
        System.out.println("Biaya untuk memasang keramik adalah: " + B.hargaKebutuhan() + " Rupiah\n");
        
        System.out.println("Metode Non Void");
        System.out.println("Keramik C");
        MetodeNonVoid C = new MetodeNonVoid();
        C.harga = 60000;
        C.panjang = 40;
        C.lebar = 30;
        C.isi = 8;
        C.luas = 1000000;
        System.out.println("Luas Keramik perbox adalah : " + C.hitungLuasKeramik() + "cm2");
        System.out.println("Bahan yang dibutuhkan adalah: " + C.hitungBahan() + " Box");
        System.out.println("Biaya untuk memasang keramik adalah: " + C.hargaKebutuhan() + " Rupiah\n");
        
        System.out.println("Rumus Constructor");
        System.out.println("Keramik A");
        MetodeConstructor c1 = new MetodeConstructor(1000000, 30, 30, 10, 54000);
        c1.hitungLuasKeramik();
        c1.hitungBahan();
        c1.hitungHargaKebutuhan();
        
        System.out.println("Keramik B");
        MetodeConstructor c2 = new MetodeConstructor(1000000, 40, 40, 5, 65000);
        c2.hitungLuasKeramik();
        c2.hitungBahan();
        c2.hitungHargaKebutuhan();
        
        System.out.println("Keramik C");
        MetodeConstructor c3 = new MetodeConstructor(1000000, 30, 40, 8, 560000);
        c3.hitungLuasKeramik();
        c3.hitungBahan();
        c3.hitungHargaKebutuhan();
    }
    
}
