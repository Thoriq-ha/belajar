/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanOOP;

/**
 *
 * @author ThoriQ
 */
public class ATK {

    String nama;
    int stok;
    int Hsatuan;
    int Harga;
    int total;

    public void setATK(String nama, int stok, int Hsatuan) {
        this.nama = nama;
        this.stok = stok;
        this.Hsatuan = Hsatuan;
        this.Harga = stok * Hsatuan;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHsatuan() {
        return Hsatuan;
    }

    public int getHarga() {
        return Harga;
    }

//    total Harga
    public void setTotal() {
        this.total += Harga;

    }

    public int getHargaTotal() {
        return total;
    }

//    -------------
    public void cetak() {
        System.out.println("Nama Alat Tulis : " + nama);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan : " + Hsatuan);
        System.out.println("Harga " + nama + ": " + Harga);
        System.out.println("");

    }

}

class main {

    public static void main(String[] args) {
        ATK aa = new ATK();
        aa.setATK("bolpoint", 10, 2000);
        aa.setTotal();
        aa.cetak();

        aa.setATK("pensil", 10, 1000);
        aa.setTotal();
        aa.cetak();
        
        aa.setATK("penghapus", 10, 500);
        aa.setTotal();
        aa.cetak();
        
        ctkTotal(aa);

    }

    public static void ctkTotal(ATK atk) {
//        ATK aa = new ATK();
        System.out.println(atk.getHargaTotal());
    }

}
