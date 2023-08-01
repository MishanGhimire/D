class Demo{
    
    static double pie;
    
    public void Computer(){
        System.out.println("Playing Games...");
    }


    public String Mobile(int n){
        if(n <= 16)
        return "Busy";

        return "Free";
    }
}

public class Pen {
    public static void main(String[] args) {

        Demo task = new Demo();

        task.Computer();
        String str = task.Mobile(18);

        System.out.println(str);

        Demo.pie=3.14;

        System.out.println(Demo.pie);
        
    } 
}
 