package demodatatype;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2 dạng: ax^2 + bx + c = 0: ");
        double a;
        double b;
        double c;
        Scanner ss = new Scanner(System.in);

        System.out.print("nhap gia tri a: ");
        a = ss.nextDouble();
        System.out.print("nhap gia tri b: ");
        b = ss.nextDouble();
        System.out.print("nhap gia tri c: ");
        c = ss.nextDouble();

        double dt;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo nghiem ");
            } else {
                System.out.println("co 1 nghiem: " + (-c / b));
            }
        } else {
            dt = b * b - (4 * a * c);

            if (dt < 0) {
                System.out.println("vo nghiem ");
            } else if (dt == 0) {
                System.out.println("nghiem kep  " + (-b / (2 * a)));
            } else {
                double x1 = (-b - Math.sqrt(dt)) / (2 * a);
                double x2 = (-b + Math.sqrt(dt)) / (2 * a);
                System.out.println("2 nghiem : " + x1 + " and " + x2);
            }
        }

        ss.close();
    }
}