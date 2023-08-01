import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1 = input.nextInt();
        System.out.println("Enter num1:");
        int num2 = input.nextInt();
        System.out.println("Enter num1:");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Num1 Greatest");
        }else if(num2 > num3){
            System.out.println("Num2 Greatest");
        }else{
            System.out.println("Num3 Greatest");
        }
    input.close();  
    }
    
}
