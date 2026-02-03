import java.util.Scanner;

public class bai1{
public static void main(String[] args) {
    int so1, so2 , tong , hieu = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("moi nhap so 1 ");
    so1 = scanner.nextInt();
    System.out.println("moi nhap so 2");
    so2 = scanner.nextInt();
    if(so2 != 0){
       int thuong = so1 % so2;
       System.out.println("thuong 2 so: " + thuong);
    }
    else {System.out.println("khong chia duoc cho 0");}
    System.out.println("tong 2 so la: " + (so1 + so2));
    System.out.println("hieu 2 so la: "+ (so1 - so2));
    System.out.println("tich 2 so la: " + (so1 * so2));
    if (so1>so2) {
        System.out.println(so1 + " > " + so2); }
    else {System.out.println(so1 + " < " + so2);}
        
    }    
 }
