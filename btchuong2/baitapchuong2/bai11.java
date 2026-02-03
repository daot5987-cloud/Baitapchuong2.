import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang");
        n = scanner.nextInt();
        int a []  = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("a[" + i +"]");
            a[i] =scanner.nextInt();

        }
       Arrays.sort(a);
        System.out.println("sap xep mang tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
    } 
}
}
