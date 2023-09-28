import java.util.Scanner;

public class forexamp2 {
    public static void main(String[] args) {
        System.out.println("so chia het cho 3 va 9 tu tap n\nMoi nhap n:");
        Scanner ss =new Scanner(System.in);
        int n = ss.nextInt();
        for(int i = 1; i <= n ; i ++) {
            if(i % 3 == 0 && i % 9 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
