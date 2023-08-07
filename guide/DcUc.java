class Up
{
    public void show1()
    {
        System.out.println("in class up");
    }
}
class Dn extends Up
{
    public void show2()
    {
        System.out.println("in down class");
    }
}

public class DcUc 
{
    public static void main(String[] args)
    {
        Up obj = new Dn(); //up casting
        obj.show1();

        Dn obj1 = (Dn) obj; //down casting
        obj1.show2();
    }    
}