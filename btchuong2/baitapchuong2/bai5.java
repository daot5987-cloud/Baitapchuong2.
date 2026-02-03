import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        int n, tong = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("moi nhap cac so nguyen");
            n = scanner.nextInt();
            tong+= n;
            System.out.println("tong = " + tong);
        }
        while(tong <= 100);
            System.out.println("tong" + tong);
    }
}
