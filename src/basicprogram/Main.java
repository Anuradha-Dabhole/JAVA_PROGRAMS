package basicprogram;
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // 🔼 Upcasting happens here
        a.sound();  // Output: Dog barks (polymorphism)
    }
}