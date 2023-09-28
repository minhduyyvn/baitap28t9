import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        System.out.println("chương trình kiểm tra số nguyên tố:\nMời nhập số nguyên tố:");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        for(int i = 2; i < n ; i ++) {
            if(n % i == 0 ) {
                System.out.println("Nó không số nguyên tố");
            } else {
                System.out.println("so nguyên tố");
            }
            return;
        }
    }
}
