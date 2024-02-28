public class Kategori {
    public static String getKategori(double num1, double num2) {
        double result = num1 + num2;
        if (result % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }
}
