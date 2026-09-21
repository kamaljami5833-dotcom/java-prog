import java.util.Scanner;

public class Arraysum {
    static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the no of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Sum of array elements: " + sum(arr));
    }
}
