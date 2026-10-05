class A {
    void displayA() {
        System.out.println("This is class A");
    }
}
class B extends A {
    void displayB() {
        System.out.println("This is class B");
    }
}
class C extends B {
    void displayC() {
        System.out.println("This is class C");
    }
}
public class Multilevelinheritance {
    public static void main(String args[]) {
        C c = new C();
        c.displayA();
        c.displayB();
        c.displayC();
    }
}
