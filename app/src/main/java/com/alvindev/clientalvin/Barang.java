package com.alvindev.clientalvin;

public class Barang {
    private int id;
    private String namaBarang, harga, keterangan, gambar, promo;

    public Barang(int id, String namaBarang, String harga, String keterangan, String gambar, String promo) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.keterangan = keterangan;
        this.gambar = gambar;
        this.promo = promo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }
}
