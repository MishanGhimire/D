class Homo {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // public Homo(int age, String name){
    //     this.age = age;
    //     this.name = name;
    // }

    // public int getAge() {
    // return age;
    // }

    // public void setAge(int a) {
    // age = a;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setName(String n) {
    // name = n;
    // }
}

public class Human {
    public static void main(String[] args) {
        Homo hum = new Homo();

        // Homo hum1 = new Homo(20, "Suyog");
        
        hum.setAge(19);
        hum.setName("ranadai");
        System.out.println(hum.getAge());
        System.out.println(hum.getName());
    }
}