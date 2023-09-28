import java.util.Scanner;

public class hoandoi {
    public static void main(String[] args) {
        System.out.println("chuong trinh hoan doi 2 so: \nMoi nhap 2 so: ");
        Scanner ss = new Scanner(System.in);
        int a, b, c;
        System.out.println("nhap a: ");
        a = ss.nextInt();
        System.out.println("nhap b: ");
        b = ss.nextInt();

        c= a ;
        a = b;
        b = c;

        System.out.println("vay gia tri hoan doi cua a la: " + a);
        System.out.println("vay gia tri hoan doi cua b la: " + b);
    }
}
/* dung thuat toan xor:
public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using XOR operation
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
 */