import java.util.Scanner;

public class Input{
    public static void main(String []args){
        Scanner add = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = Integer.parseInt(add.nextLine());
        System.out.println("Enter num2:");
        int num2 = add.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is " + sum);
        add.close();
    }
}