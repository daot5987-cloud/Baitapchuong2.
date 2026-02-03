import java.util.Scanner;

public class bai3{
    public static void main(String[] args) {
        int nam;
        int tuoi = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap ten cua ban");
        String ten = scanner.nextLine();
        System.out.println("Moi nhap nam sinh");
        nam = scanner.nextInt();
        System.out.println("moi nhap nam hien tai");
        int namhientai = scanner.nextInt();
        tuoi = namhientai - nam;
        if(tuoi < 16){
            System.out.println("ban" + ten +" nam nay ban "+ tuoi +" tuoi" +" o do tuoi vi thanh nien " );
        }
        else if (tuoi >=16 && tuoi <18){
            System.out.println("ban"+ ten +" nam nay ban "+ tuoi +" tuoi" + " o do tuoi truong thanh");
        }
        else if (tuoi>=18) {
            System.out.println("ban " + ten + " nam nay ban "+ tuoi +" tuoi" +" ban da gia");
        }
        
    }
}