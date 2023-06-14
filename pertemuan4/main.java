package com.Florean_Desvita_Cindirahayu.pbo.pertemuan4;

public class main {
    public static void main(String[] args) {
        Manager managerSaya = new Manager();
        Pegawai pegawaiSaya = new Pegawai();

        managerSaya.nip = 12345678;
        managerSaya.nama = "Florean";

        pegawaiSaya.nip = 21234567;
        pegawaiSaya.nama = "Rajiva";

        managerSaya.ShowInfo();
        managerSaya.extraInfo();
        managerSaya.bonus();
        managerSaya.bonus(7800000);

        pegawaiSaya.ShowInfo();
        pegawaiSaya.extraInfo();

    }
}
