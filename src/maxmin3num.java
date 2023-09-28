import java.util.Scanner;

public class maxmin3num {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh max 3 so: \nMoi nhap 3 so:  ");
        Scanner ss = new Scanner(System.in);
        int a, b, c;
        a = ss.nextInt();
        b = ss.nextInt();
        c = ss.nextInt();

        // xu li
        if(a >= b && a >= c) {
            System.out.println("max: " + a);
        } else if(b >= c ) {
            System.out.println("max: " + b);
        } else {
            System.out.println("max: " + c);
        }
    }
}
