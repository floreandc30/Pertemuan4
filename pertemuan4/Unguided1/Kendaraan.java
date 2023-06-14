package com.Florean_Desvita_Cindirahayu.pbo.pertemuan4.Unguided1;

public class Kendaraan {
    private String jenis;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void jalan() {
        System.out.println(jenis + " berjalan.");
    }
}

