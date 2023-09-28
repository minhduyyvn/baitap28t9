import java.util.Scanner;

public class demotong100sont {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Tính tổng 100 số nguyên tố đầu tiên: ");
            int count = 0; // Đếm số nguyên tố đã tìm thấy
            int number = 2; // Số nguyên để kiểm tra tính nguyên tố
            long sum = 0; // Tổng các số nguyên tố đã tìm thấy

            while (count < 100) {
                if (isPrime(number)) {
                    sum += number;
                    count++;
                }
                number++;
            }

            System.out.println("Tổng của 100 số nguyên tố đầu tiên là: " + sum);

            // Kiểm tra xem người dùng có muốn tiếp tục hay không
            System.out.println("Bạn có muốn tiếp tục? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Chương trình kết thúc.");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}