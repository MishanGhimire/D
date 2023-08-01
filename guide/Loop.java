import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of Num:");
        int num = input.nextInt();
        // for(int i =0; i<=num; i++){
        //     System.out.println("Hello World");
        // }

        do{
            System.out.println("Hello World");
            i++;
        }while(i <= num);
    }
}
