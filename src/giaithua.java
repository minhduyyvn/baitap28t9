import java.util.Scanner;

public class giaithua {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh giai thua \nMoi nhap n:");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int awn = 1;
        for(int i = n; i >= 1 ; i--){
            awn = awn *i ;
        }
        System.out.println("ket qua la: "+ awn);
    }
}
