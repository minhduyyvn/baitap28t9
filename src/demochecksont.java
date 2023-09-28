import java.util.Scanner;

public class demochecksont {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra số nguyên tố");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Mời nhập số nguyên tố (nhập 0 để thoát): ");
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println("Kết thúc chương trình");
                break;
            }

            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không là số nguyên tố");
            }
        }

        scanner.close();
    }
}