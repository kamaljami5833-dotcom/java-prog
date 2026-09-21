import java.util.Scanner;
public class Quadratic{
static void findRoots(int a, int b, int c) {
    double discriminant = b * b - 4 * a * c;
    if (discriminant > 0) {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Roots are real and different.");
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    } else if (discriminant == 0) {
        double root = -b / (2 * a);
        System.out.println("Roots are real and the same.");
        System.out.println("Root: " + root);
    } else {
        System.out.println("Roots are complex and different.");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter coefficients a, b and c: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
        findRoots(a, b, c);
    }
}
