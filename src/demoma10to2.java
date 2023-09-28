import java.util.Scanner;

public class demoma10to2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập số thập phân (nhập -1 để thoát): ");
            int decimal = scanner.nextInt();

            if (decimal == -1) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            String binary = convertDecimalToBinary(decimal);
            System.out.println("Kết quả chuyển đổi sang nhị phân là: " + binary);
        }

        scanner.close();
    }

    public static String convertDecimalToBinary(int decimal) {    //khai báo hàm để xài, hàm có tham số decimal
        StringBuilder binary = new StringBuilder();

        if (decimal == 0) {
            binary.append("0");
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.append(remainder);   //method ni tương đương gan thôi
                decimal /= 2;
            }
        }

        return binary.reverse().toString();   //biến ni để đảo nguowcjj chuỗi
    }
}