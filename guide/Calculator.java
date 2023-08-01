import java.util.Scanner;


class Mob{
    public int add(int n1, int n2){
        // int sum = n1 + n2;
        return n1 + n2;
    }
}

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mob calc = new Mob();

        System.out.println("Enter Num1:");
        int num1 = input.nextInt();

        System.out.println("Enter Num2:");
        int num2 = input.nextInt();

        int result = calc.add(num1,num2);

        System.out.println("Sum is "+result);

    }       
}