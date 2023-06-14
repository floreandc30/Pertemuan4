package com.Florean_Desvita_Cindirahayu.pbo.pertemuan4;

public class Manager extends Pegawai {
    public void bonus (int bonus) {
        System.out.println("Pegawai dengan nama " + nama +" (" + nip + ") mendapatkan bonus sebesar Rp." + bonus);
    }

    public void extraInfo() {
        System.out.println("Jabatan Pegawai : Manager ");
    }
    public void bonus (){
        System.out.println("Error : Harap masukan nominal bonus!");
    }
}
