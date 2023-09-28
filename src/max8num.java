import java.util.Scanner;
//ra là max min 8 số ;
public class max8num {
    public static void main(String[] args) {
        System.out.println("chuong trinh tim so lon nhat 8 so: ");
        Scanner ss = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= 8; i ++) {
            System.out.println("nhập số thứ "+ i );
            int a = ss.nextInt();
            if ( max < a ) {
                max = a ;
            } else if (min > a ) {
                min = a;
            }


        }
        System.out.println("số lớn nhất là: " + max);
        System.out.println("số bé nhất là: " + min);
    };
}
