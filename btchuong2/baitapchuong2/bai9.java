import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        int demsothuong = 0;
        int demsohoa = 0;
        int demso =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi ");
         String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                demsothuong++;
            } else if (c >= 'A' && c <= 'Z') {
                demsohoa++;
            } else if (c >= '0' && c <= '9') {
                demso++;
        }     
    }
    System.out.println("So ky tu thuong: " + demsothuong);
    System.out.println("So ky tu hoa: " + demsohoa);
    System.out.println("So chu so: " + demso);
}
}
