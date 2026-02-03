import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n , tong = 0;
        double tbc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("phan so phan tu");
        n = scanner.nextInt();
        for(int i = 0; i<=n; i++){
            System.out.println("moi nhap so thu " + i + ":");
            tong += scanner.nextInt();
        }
        tbc = (double)tong/n;
        System.out.println("trung binh cong "+ tbc);
    }
}
