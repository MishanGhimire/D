import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner condition = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = condition.nextInt();
        System.out.println("Enter num2:");
        int num2 = condition.nextInt();

        if(num1 > num2){
            System.out.println(num1+" is Greater.");
        }else{
            System.out.println(num2+" is Greater.");
        }
    }
}
