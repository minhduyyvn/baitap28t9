import java.util.Scanner;

public class exampwhileloop {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("moi nhap cau de lap: ");
        String text;
        text = ss.nextLine();
        System.out.println("Moi nhap so lan lap:");
        int n = ss.nextInt();
        int i = 1;
        while (i <= n ) {
            System.out.println(i+" : " + text);
            i++;
        }
    }
}
