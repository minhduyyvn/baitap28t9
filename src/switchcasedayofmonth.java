import java.util.Scanner;

public class switchcasedayofmonth {
    public static void main(String[] args) {
        System.out.println("chương trình tính số ngày trong tháng: ");
        System.out.println("Mời nhập tháng: ");
        Scanner ss = new Scanner(System.in);
        int m = ss.nextInt();
        switch (m ) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng "+ m + " có 31 ngày.");
                break;
            case 2:
                System.out.println("Trường hợp này cần nhập số năm: ");
                int year = ss.nextInt();
                if((year % 4 == 0)&& (year != 100 )) {
                    System.out.println("Tháng này có 29 ngày");
                } else {
                    System.out.println("Tháng này có 28 ngày ");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng có 30 ngày ");
                break;
            default:
                System.out.println("Làm éo gì có tháng này!");
        }

    }
}
