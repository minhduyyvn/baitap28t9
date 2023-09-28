import java.util.Scanner;

public class tongleduongtrongmang {
    public static void main(String[] args) {
        System.out.println("chương trình tính tổng lẻ số dương: ");
        System.out.println("Mời nhập số phần tử");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] array = new int[n];
        //nhập từng so phẩn tử của mảng

        for(int i = 0 ; i < n; i ++) {
            System.out.println("moi nhap phan tu thu " + i);
            array[i] = ss.nextInt();
        };

        //xu li
        int an = 0;
        for(int i = 0; i < n ; i++) {
            if (array[i] % 2 != 0 && array[i] > 0 ) {
                an +=  array[i];
            }
        }
        System.out.println("kết quả là: " + an);
    }
}
