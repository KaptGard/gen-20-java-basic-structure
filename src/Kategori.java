public class Kategori {
    public static String getKategori(double num1, double num2) {
        double hasil = num1 + num2;
        if (hasil % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }
}
