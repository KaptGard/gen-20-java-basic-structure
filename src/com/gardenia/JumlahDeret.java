package com.gardenia;

public class JumlahDeret {
    public int programhitungan(int hitungan) {
        int jumlah = 0;

        for (int i = 1; i <= hitungan; i++) {
            jumlah += i;
        }
        return jumlah;
    }
}
