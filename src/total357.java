import java.util.Scanner;

public class total357 {
    public static void main(String[] args) {
        System.out.println("tinh tong 1 + 3 + 5 +... N :\nMoi nhap N: ");
        Scanner ss = new Scanner(System.in);
        int n ;
        int kq = 0;
        n = ss.nextInt();

        //tinh toan
        for(int i  = 0 ; i <= n ; i ++) {
          if (i % 2 == 0 ) {
              continue ;
          }
          kq = kq +i;
        };
        System.out.println("Tong la: " + kq );
    }
}
