import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demopt1sothanhsont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Mời nhập số cần phân tích (nhập -1 để thoát): ");
            int n = scanner.nextInt(); // Số nguyên cần phân tích

            if (n == -1) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            System.out.println("Phân tích số " + n + " thành tích các thừa số nguyên tố:");
            List<Integer> factors = primeFactorization(n);  //găắn các số ngto đã phân tích vào danh sách
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static List<Integer> primeFactorization(int n) {  //đây là cốt lõi xử lý, gọi hàm ra để dùng ở trên
        List<Integer> factors = new ArrayList<>();

        // Phân tích các thừa số 2
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Phân tích các thừa số lẻ
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // Trường hợp còn lại là số nguyên tố
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}