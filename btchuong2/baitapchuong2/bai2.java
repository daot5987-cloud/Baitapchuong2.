import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("moi nhap so so nguyen : ");
        n = scan.nextInt();
        if(n%2 == 0){
            System.out.println("la so chan");
        }
        else { System.out.println(n + " la so le");}
    }
}
