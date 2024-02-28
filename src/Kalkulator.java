public class Kalkulator {
    private double num1;
    private double num2;

    public Kalkulator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1 + num2;
    }

    public double substract() {
        return num1-num2;
    }

    public double multiply() {
        return num1*num2;
    }

    public double divide() {
        if (num2 !=0) {
            return num1/num2;
        } else {
            System.out.println("Error: Tidak bisa membagi dengan nol");
            return Double.NaN;
        }
    }
}
