import java.util.Scanner;

public class max6num {
    public static void main(String[] args) {
       Scanner ss = new Scanner(System.in);
       int max = Integer.MIN_VALUE; // gắn max bằng giá trị nhỏ nhát của integer
       for(int i = 1; i <= 6; i ++) {
            System.out.println("nhập số thứ "+ i );
            int a = ss.nextInt();
           if ( max < a ) { //so sánh số max với số nhập vào
               max = a ;  // đúng thì gắn max bằng a,
           }
        }
        System.out.println("số lớn nhất là: " + max);
    };
}
//tư duy: gắn max thành số nhỏ nhất, rồi cho lặp 6 số và so sánh;
