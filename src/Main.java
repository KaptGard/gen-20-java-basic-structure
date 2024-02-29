import com.gardenia.Bilangan_bulat;
import com.gardenia.JumlahDeret;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Program Saya");
        System.out.println("Nama Anda : ");
        String nama = scanner.nextLine();
        System.out.println("Halo " + nama);

        System.out.println("Masukkan Angka Pertama: ");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan Angka Kedua: ");
        double num2 = scanner.nextDouble();

        Kalkulator  calc = new Kalkulator(num1, num2);

        System.out.println("Pilih operasi matematika yang diinginkan: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Masukkan Pilihan Anda");
        int pilihan = scanner.nextInt();

        double hasil = 0;
        if (pilihan == 1) {
            hasil= calc.tambah();
            System.out.println("Hasil Penjumlahan : " + hasil);
        } else if (pilihan == 2) {
            hasil = calc.kurang();
            System.out.println("Hasil Pengurangan : " + hasil);
        } else if (pilihan == 3) {
            hasil = calc.kali();
            System.out.println("Hasil Perkalian : " + hasil);
        } else if (pilihan == 4) {
            hasil = calc.bagi();
            System.out.println("Hasil Pembagian : " + hasil);

        }


        System.out.println("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        Triangle.segitiga(tinggi);

        System.out.println("Kategori Hasil Penjumlahan: " + Kategori.getKategori(num1, num2));

        System.out.println("Masukkan bilangan bulat positif n: ");
        int bulat = scanner.nextInt();

        System.out.println("Bilangan bulat positif pertama yang habis dibagi 3 : ");
        Bilangan_bulat.Bilangan(bulat);

        System.out.println("Masukkan nilai n: ");
        int hitungan = scanner.nextInt();

        JumlahDeret deret = new JumlahDeret();
        int jumlah = deret.programhitungan(hitungan);

        System.out.println("Jumlah deret aritmatika adalah: " + hasil);



        scanner.close();
    }
}
