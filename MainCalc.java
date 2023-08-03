import calculator.Calcv1;

public class MainCalc {
    public static void main(String[] args) {
        Calcv1 calc = new Calcv1();
        int r1 = calc.add(8, 10);
        int r2 = calc.sub(10, 8);
        int r3 = calc.multi(8,9);

        System.out.println(r1 + " " + r2 + " "+ r3);
    }
}
