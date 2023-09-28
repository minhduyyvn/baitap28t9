import java.util.Scanner;

public class checksonguyento {
    public static void main(String[] args) {
        System.out.println("kiểm tra số nguyên tố:\nMời nhập số: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        boolean check = true;

        if(n <=1) {
            check = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0 ) {
                    check = false;
                    break;
                }
            }
        }
        if(check) {
            System.out.println("so nguyen to");
        } else {
            System.out.println("khong phai so nguyen to");
        }
    }
}
