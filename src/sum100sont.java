public class sum100sont {
    public static void main(String[] args) {
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
}