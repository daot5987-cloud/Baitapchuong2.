import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        long gt = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao 1 so nguyen");
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
             gt *= i; 
        }
         System.out.println(n+"!"+" = "+ gt );
    }
    
}
