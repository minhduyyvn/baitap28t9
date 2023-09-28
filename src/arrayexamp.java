public class arrayexamp {
    public static void main(String[] args) {
        System.out.println("Chương trình minh họa cấu trúc Array: ");
        //khai báo cú pháp:
        String[] name = new String[] {   // cú pháp khai báo 1 array tên là name:
                "một", "hai", "ba"       // các phần tử trong array
        };
        System.out.println(name[1]);// in ra phần tử trong array



        for (int i = 0; i <= name.length ; i ++) {  //dùng vòng lặp để in ra các phần tử trong array
            System.out.println(name[i]);
        }
    }
}
