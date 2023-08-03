import calculator.Calc;

public class MainCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int r1 = calc.add(8, 10);
        int r2 = calc.sub(10, 8);

        System.out.println(r1 + " " + r2);
    }
}
