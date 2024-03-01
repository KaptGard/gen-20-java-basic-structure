package com.gardenia; //deklarasi paket

public class JumlahDeret { //deklarasi class
    public int programhitungan(int hitungan) { //deklarasi method yang menerima tipe data int dengan nama hitungan
        int jumlah = 0; //deklarasi tipe data integer dengan nama jumlah dan nilai 0

        for (int i = 1; i <= hitungan; i++) { // loop for digunakan untuk mengulangi proses penambahan dari 1 sampai nilai 'hitungan'
            jumlah += i; //pada setiap iterasi nilai i akan ditambah ke variabel jumlah
        }
        return jumlah; // setelah loop dieksekusi maka method akan mengembalikan nilai dari variabel 'jumlah'
    }
}
