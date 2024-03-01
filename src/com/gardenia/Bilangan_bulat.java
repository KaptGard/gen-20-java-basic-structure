package com.gardenia; // ini merupakan deklarasi bahwa class kita berada pada paket yang berbeda dari classs utama

public class Bilangan_bulat { //Deklarasi nama class yang nantinya akan kita panggil ke class utama atau dengan void main

    public static void Bilangan(int bulat) { // ini adalah deklarasi mode statis 'Bilangan disini' adalah penerima satu parameter bertipe data integer
        // yang diebut bulat. metode ini tidak mengembalikan nilai alias void yang ditandai kata kunci static
        int hitung = 0; //deklarasi variabel dengan tipe data integer
        int nomor = 1; //deklarasi variabel dengan tipe data integer

        while (hitung < bulat) { // memulai loop while, loop ini akan selalu berjalan selama nilai 'hitung' kurang dari parameter 'bulat'
            if (nomor % 3 == 0 && nomor % 2 != 0) { //pengecekan kondisi apakah variabel 'nomor' habis dibagi 3 atau tidak habis dibagi 2
                System.out.println(nomor); // memunculkan hasil dari variabel 'nomor'
                hitung++; //meningkatkan nilai dari variabel 'hitung' setiap kali sebuah angka memenuhi kondisi di print
            }
            nomor++; // meningkatkan nilai 'nomor' agar loop dapat mencari angka berikutnya yang memenuhi kondisi
        }
    }
}
