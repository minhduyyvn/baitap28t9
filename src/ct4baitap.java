import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ct4baitap {
    public static void main(String[] args) {
        System.out.println("Có 4 chương trình, mời bạn lựa chọn: ");
        System.out.println("1. Kiểm tra số nguyên tố");
        System.out.println("2. Tính tổng 100 số nguyên tố đầu tiên");
        System.out.println("3. Phân tích một số thành tích các số nguyên tố");
        System.out.println("4. Chuyển đổi mã thập phân sang nhị phân");
        System.out.println("Chọn từ 1 đến 4: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checksonguyento();
                break;
            case 2:
                sum100sont();
                break;
            case 3:
                tichsont();
                break;
            case 4:
                ma10toma2();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4.");
                break;
        }

        scanner.close();
    }

    public static void checksonguyento() {
        System.out.println("kiểm tra số nguyên tố:\nMời nhập số: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        boolean check = true;

        if(n <=1) {
            check = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0 ) {
                    check = false;
                    break;
                }
            }
        }
        if(check) {
            System.out.println("so nguyen to");
        } else {
            System.out.println("khong phai so nguyen to");
        }
    }
        // Code kiểm tra số nguyên tố


    public static void sum100sont() {
        // Code tính tổng 100 số nguyên tố đầu tiên
        System.out.println("tong 100 so nguyen to dau tien : ");
        int count = 0; // Đếm số nguyên tố đã tìm thấy
        int number = 2; // Số nguyên dùng để kiểm tra tính nguyên tố
        long sum = 0; // Tổng các số nguyên tố đã tìm thấy

        while (count < 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Tổng của 100 số nguyên tố đầu tiên là: " + sum);
    }

    //gói cục xử lí vào 1 hàm: isPrime để kiểm tra số nguyên to
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


    public static void tichsont() {
        // Code phân tích một số thành tích các số nguyên tố
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

    public static void ma10toma2() {
        // Code chuyển đổi mã thập phân sang nhị phân
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimal = scanner.nextInt();

        String binary = convertDecimalToBinary(decimal);
        System.out.println("Kết quả chuyển đổi sang nhị phân là: " + binary);
    }

    public static String convertDecimalToBinary(int decimal) {
        StringBuilder du = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            du.append(remainder);  // gắn số dư vào biến du thoi
            decimal /= 2;   //tiếp tục chia 2 rồi lặp để lấy phần du
        }

        // Đảo chuỗi nhị phân
        String binary = du.reverse().toString();

        return binary;

    }
}