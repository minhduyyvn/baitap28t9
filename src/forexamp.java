import java.util.Scanner;

public class forexamp {
    public static void main(String[] args) {
        System.out.println("chương trình minh họa vòng lặp for \nmời nhập số lần lặp ");
        Scanner ss = new Scanner(System.in);
        int n= ss.nextInt();
        //chương trình
        for(int i = 1; i <=n; i ++) {
            System.out.println("lần lặp thứ " + i);
        }
    }
}
