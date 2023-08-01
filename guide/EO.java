import java.util.Scanner;

public class EO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int n = input.nextInt();

        if(n % 2 == 0)
        System.out.println("Even");
        else
        System.out.println("Odd");

    }
}
