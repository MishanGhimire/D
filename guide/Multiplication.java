import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",n, i, n*i);
        }
        input.close();
    }
}
