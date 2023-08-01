/*public class Array {
    public static void main(String[] args) {
        int[] n = {10,20,30,40,50};

        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
        }
    }
}
*/

//Decalre an array and get input form the user


import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] n = new int[5];
        System.out.println("Enter the Elements of Array:");
        for(int i=0; i<n.length; i++){
          n[i] = input.nextInt(); 
         
        }
        System.out.println("Outsdie Loop:");
        for(int i=0; i<n.length; i++){
        System.out.println(n[i]);    
        }
        
    }
}

