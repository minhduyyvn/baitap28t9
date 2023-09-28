import java.util.Scanner;

public class min8num {
    public static void main(String[] args) {
        System.out.println("chuong trinh tim so be nhat trong 8 so: ");
        Scanner ss = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= 8; i ++) {
            System.out.println("nhập số thứ "+ i );
            int a = ss.nextInt();
            if ( min > a ) {
                min = a ;
            }
        }
        System.out.println("so be nhat la : " + min);
    };
}
