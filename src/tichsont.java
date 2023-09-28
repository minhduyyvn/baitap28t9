import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tichsont {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("mời nhập số cần phân tích");
        int n = ss.nextInt(); // Số nguyên cần phân tích

        System.out.println("Phân tích số " + n + " thành tích các thừa số nguyên tố:");
        List<Integer> factors = primeFactorization(n);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
    }

    public static List<Integer> primeFactorization(int n) {
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