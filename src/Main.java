import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Angka Pertama: ");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan Angka Kedua: ");
        double num2 = scanner.nextDouble();

        Kalkulator  calc = new Kalkulator(num1, num2);
        System.out.println("Penjumlahan: " + calc.add());
        System.out.println("Pengurangan: " + calc.substract());
        System.out.println("Perkalian: " + calc.multiply());
        System.out.println("Pembagian: " + calc.divide());

        System.out.println("Tampilan Segitiga: ");
        Triangle.draw(9);

        System.out.println("Kategori Hasil Penjumlahan: " + Kategori.getKategori(num1, num2));
    }
}
