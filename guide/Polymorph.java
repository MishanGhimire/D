
class A{
    public void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}

class C extends B{
    public void show(){
        System.out.println("In class C");
    }
}

public class Polymorph {
    public static void main(String[] args) {
        A obj = new C();
        obj.show();


        obj = new B();
        obj.show();
    }
}
// class Animal {
//   public void animalSound() {
//     System.out.println("The animal makes a sound");
//   }
// }

// class Pig extends Animal {
//   public void animalSound() {
//     System.out.println("The pig says: wee wee");
//   }
// }

// class Dog extends Animal {
//   public void animalSound() {
//     System.out.println("The dog says: bow wow");
//   }
// }

/*class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

 */