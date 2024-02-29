public class Kalkulator {
    public double num1;
    public double num2;

    public Kalkulator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double tambah() {
        return num1 + num2;
    }

    public double kurang() {
        return num1-num2;
    }

    public double kali() {
        return num1*num2;
    }

    public double bagi() {
        if (num2 !=0) {
            return num1/num2;
        } else {
            System.out.println("Error: Tidak bisa membagi dengan nol");
            return Double.NaN;

        }
    }
}
