package com.gardenia;

public class Bilangan_bulat {
    public static void Bilangan(int bulat) {
        int hitung = 0;
        int nomor = 1;

        while (hitung < bulat) {
            if (nomor % 3 == 0 && nomor % 2 != 0) {
                System.out.println(nomor);
                hitung++;
            }
            nomor++;
        }
    }
}
