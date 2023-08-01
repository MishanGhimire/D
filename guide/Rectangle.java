
import java.util.Scanner;


class Rect {

    public void Test(){
        System.out.println("Hello");
    }
	public int Area(int num1, int num2) {
		int area = num1 * num2;
        return area;
	}
	
	public int Perimeter(int num1, int num2) {
		int peri = 2*(num1+num2);
		return peri;

	}
}

public class Rectangle {
    public static void main(String[] args) {
        Rect rect = new Rect();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Height:");
		int n1 = input.nextInt();
		
		System.out.println("Enter the Height:");
		int n2 = input.nextInt();
		
		int Area = rect.Area(n1,n2);
        int Perimeter = rect.Perimeter(n1,n2);

        System.out.println("Area: "+Area);
        System.out.println("Perimeter: "+Perimeter);
        rect.Test();
    }   
}
