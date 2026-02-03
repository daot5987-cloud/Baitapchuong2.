import java.util.Scanner;

public class bai10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao chuoi ky tu khong qua 80");
            String chuoi = scanner.nextLine();   
            System.out.println("nhap ky 1 ky tu dem");
            char kytu = scanner.next().charAt(0);
            int dem = 0;
            // duyệt từng chuỗi ký tự 1 
            for(int i=0; i<chuoi.length();i++){
                if (chuoi.charAt(i)== kytu) {
                    dem++;
                }           
            }
            System.out.println("ky tu "+ kytu + " xuat hien" + dem + " lan trong chuoi");

        }
}
