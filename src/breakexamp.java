import java.util.Scanner;

public class breakexamp {
    public static void main(String[] args) {
        System.out.println("chương trình in ra số từ 1 tới n:\nMời nhập n:");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int max = Integer.MAX_VALUE;
        for(int i = 1; i <= max; i++ ) {
            if (i == (n+1) ) {
                break;
            }
            System.out.println(i);
        }
    }
}
