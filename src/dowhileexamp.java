import java.util.Scanner;

public class dowhileexamp {
    public static void main(String[] args) {
        System.out.println("chuong trinh lap while do ");
        System.out.println("Moi nhap so lan lap");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int i = 1 ;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
//điểm khác nhau giữa while và do while chính là, do while sẽ thực hiện khối lệnh 1 lần
//rồi mới qua check điều kiện, ví dụ nhập n = 0, chương trình vẫn chạy, lặp 1 lần, còn while thì k
