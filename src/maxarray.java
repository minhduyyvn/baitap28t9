import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n ; i ++) {
            System.out.println("mời nhập các phần tử: ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i = 1; i < n; i ++) {  //lưu ý index
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("phần tử lớn nhất là: "+ max);
    }
}
