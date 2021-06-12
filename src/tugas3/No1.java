package tugas3;

import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
    System.out.println("***** SEQUENTIAL SEARCH *****"+"\n");
        String data[] = {"Galileo,", "Archimedes,", "Alkhawarizmi,", "Aljabar,", "Nama Mahasiswa,", "Tesla"};
        String cari;
        
        //fitur scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari : ");
        cari = scan.nextLine();
        
        //menampilkan data Array
        System.out.print("isi data adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        for(int i = 0; i <= data.length; i++) {
            if(cari.equalsIgnoreCase(data[i])) {
                System.out.print("Data "+cari+" berada pada index ke - "+ i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println("shidqi adi maulana");
        System.out.println();
        System.out.println("***** TERIMA KASIH *****");
    }
    }
    

