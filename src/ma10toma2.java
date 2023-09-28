import java.util.Scanner;

public class ma10toma2 {
    public static void main(String[] args) {
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

