package tugas3;
import java.util.Scanner;
public class No2 {
 public static void main(String[] args) {
        int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari;
        int IndeksAwal = 0;
        int IndeksAkhir = data.length-1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Isi data adalah ");
        for(int i = 0; i < data.length; i++) {
            
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari : ");
        cari = scan.nextInt();
        
        System.out.println("");
        System.out.println("");
        
        while((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
        point = (IndeksAwal + IndeksAkhir) / 2;
        System.out.println("Indeks pointer : "+ point);
            if(cari == data[point]) {
                ketemu = 1;
                System.out.println("Data "+ cari +" Telah ditemukan padaindeks ke " + point);
            }
            
            else if(cari < data[point]) {
                System.out.println("Cari di kiri");
                IndeksAkhir = point-1;
            }
            
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
            }
        }
        if(ketemu == 1)
            System.out.println("Kesimpulan : data ditemukan ");
        else
            System.out.println("Kesimpulan : data tidak ditemukasn ");
        
        System.out.println();
        System.out.println();
        System.out.println("shidqi adi maulana");
    }    
}
