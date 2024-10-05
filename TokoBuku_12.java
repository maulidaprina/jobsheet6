import java.util.Scanner;

public class TokoBuku_12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);

String hari, jenisBuku;
int jmlBuku, totalHarga, totalBayar, harga = 25000; 
double dblTotalHarga, dbltotalBayar, totalDiskon, diskon = 0;

System.out.print("Masukkan Hari: ");
hari = Input12.nextLine().toLowerCase();
System.out.print("Masukkan jenis buku: ");
jenisBuku = Input12.nextLine().toLowerCase();
System.out.print("masukkan jumlah buku: ");
jmlBuku = Input12.nextInt();

if (hari.equals("rabu")) {
    if (jenisBuku.equals("kamus") || jenisBuku.equals("novel")) {
        if (jenisBuku.equals("kamus")) {
            if (jmlBuku > 2) {
                diskon = 0.10 + 0.02;
            } else {
                diskon = 0.10;
            }
        } else {
            if (jmlBuku > 3) {
                diskon = 0.07 + 0.02;
            } else {
                diskon = 0.07 + 0.01;
            }
        }    
    } else if (jmlBuku > 3) {
        diskon = 0.05;
    }
}
totalHarga = harga * jmlBuku;
dblTotalHarga = (double) totalHarga;
totalDiskon = diskon * dblTotalHarga;
dbltotalBayar = dblTotalHarga - totalDiskon;
totalBayar = (int) dbltotalBayar;

System.out.println("Jenis buku adalah: " + jenisBuku);
System.out.println("Jumlah buku: " + jmlBuku);
System.out.println("Harga per buku: " + harga);
System.out.println("Total bayar: " + totalBayar);
    
    }
}

    
    

