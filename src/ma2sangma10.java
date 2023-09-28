import java.util.Scanner;

public class ma2sangma10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhị phân: ");
        String binaryString = scanner.nextLine();

        int decimal = convertBinaryToDecimal(binaryString);
        System.out.println("Kết quả chuyển đổi sang thập phân là: " + decimal);
    }

    public static int convertBinaryToDecimal(String binaryString) { //khai bao ham chuyen doi, tham so chuoi binaryString
        int decimal = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
