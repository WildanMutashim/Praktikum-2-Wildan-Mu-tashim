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
public class MetodeConstructor {
    /*atribut data keramik*/
    float luas;
    float panjang;
    float lebar;
    float isi;
    float harga;
    
    /*Constructor*/
    MetodeConstructor(float l, float p, float w, float i, float h){
        this.luas = l;
        this.panjang = p;
        this.lebar = w;
        this.isi = i;
        this.harga = h;
    }
    /*Mencari Harga Termurah*/
    void hitungLuasKeramik(){
        float LuasKeramik;
        LuasKeramik = this.panjang * this.lebar * this.isi;
        System.out.println("Luas Keramik perbox adalah " + LuasKeramik + "cm2");
    }
    
    void hitungBahan(){
        float bahan;
        bahan = this.luas / (this.panjang * this.lebar * this.isi);
        System.out.println("Bahan yang dibutuhkan adalah " + Math.ceil(bahan) + " box");
    }
    
    void hitungHargaKebutuhan(){
        float hargaTotal;
        hargaTotal = (this.luas / (this.panjang * this.lebar * this.isi)) * this.harga;
        System.out.println("Biaya untuk memasang keramik adalah " + Math.ceil(hargaTotal) + " Rupiah");
    }
}
