import java.util.Scanner;

public class ma10toma8 {
    public static void main(String[] args) {
        System.out.println("chương trình chuyển đổi mã thập phân sang mã bát phân: ");
        System.out.println("Mời nhập số thập phân: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();

        StringBuilder awn = new StringBuilder();
        while (n > 0 ) {
            int du = n % 8;
            awn.append(du);
            n /= 8 ;
        }
        //dao ngược chuỗi:
        String kq = awn.reverse().toString();
        System.out.println(kq);
    }
}
