import java.util.Scanner;

public class Pemilihan2Percobaan3_12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);

String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = Input12.nextLine();
System.out.print("Masukkan Besarnya Penghasilan: ");
penghasilan = Input12.nextInt();

if (kategori.equals("pekerja")) {
    if (penghasilan <= 2000000)
        pajak = 0.1;
    else if (penghasilan <= 3000000)
        pajak = 0.15;
    else
        pajak = 0.2;
    gajiBersih = (int) (penghasilan - (pajak * penghasilan));
    System.out.print("Penghasil Bersih: " + gajiBersih);
} else if (kategori.equals("PEBISNIS")){
    if (penghasilan <= 2000000)
        pajak = 0.15;
  else if (penghasilan <= 3500000)
    pajak = 0.2;
  else
    pajak = 0.25;
    gajiBersih = (int)(penghasilan - (pajak * penghasilan));
    System.out.println("Penghasilan Bersih: " + gajiBersih);
} else
    System.out.println("Masukan Kategori Salah!");


    }
}