class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}
public class Hierarchichalinheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        d.bark();
        c.eat();
        c.meow();
    }
}
