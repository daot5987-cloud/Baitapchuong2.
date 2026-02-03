import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dong cua ma tran");
        m = scanner.nextInt();
        System.out.println("moi nhap so cot cua ma tran ");
        n = scanner.nextInt();
        int a [] []  = new int[m][n]; // khai bao so dong so cot
        for(int i = 0 ; i<m;i++){
            for(int j = 0; j<n;j++){
                System.out.println("a["+ i +"] ["+j+"] =");
                a[i][j] = scanner.nextInt();
            }            
        }
        int max = a[0][0];
        for(int i = 0; i< m;i++){
            for(int j = 0; j<n;j++){
                if(max<a[i][j]){
                    max = a[i][j];  
                }
            }
        }
        System.out.println("phan tu lon nhat trong ma tran " + max);
    }
    
}
