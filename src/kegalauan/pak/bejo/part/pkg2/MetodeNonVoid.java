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
public class MetodeNonVoid {
    /*atribut data keramik*/
    float luas;
    float panjang;
    float lebar;
    float isi;
    float harga;

    /*Mencari Harga Termurah*/
    float hitungLuasKeramik(){
        float LuasKeramik;
        LuasKeramik = this.panjang * this.lebar * this.isi;
        return LuasKeramik;
    }
    
    float hitungBahan(){
        float bahan;
        bahan = this.luas / (this.panjang * this.lebar * this.isi);
        return (float) Math.ceil(bahan);
    }
    
    float hargaKebutuhan(){
        float hargaTotal;
        hargaTotal = (this.luas / (this.panjang * this.lebar * this.isi)) * this.harga;
        return hargaTotal;
    }    
}
