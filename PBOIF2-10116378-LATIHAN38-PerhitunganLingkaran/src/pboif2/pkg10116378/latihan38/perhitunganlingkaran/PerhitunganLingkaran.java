/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116378.latihan38.perhitunganlingkaran;

/**
 *
 * @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-IF2
 * Nim   : 10116378
 */
public class PerhitunganLingkaran {
     public static void main(String[] args) {
       Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
}
