


//every class in java extends object
class A
{

    public A(){
        super();
        System.out.println("In constructor A");
    }

    public A(int n){
        super();
        System.out.println("In constructor A int");
    }
}

class B extends A{
    public B(int n){
        super(n);
        System.out.println("In constructor B");
    }

    public B(){
        super();
        System.out.println("In constructor B int");
    }
}


public class Super {
    public static void main(String[] args) {
        B b = new B();
    }
}
