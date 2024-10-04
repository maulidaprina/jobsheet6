import java.util.Scanner;

public class Pemilihan2Percobaan2_12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);

int pilihan_menu, jmlBeli;
double harga = 0, totalBayar, diskon = 0;
String member, metodeBayar;

System.out.println("----------------------------------------------------");
System.out.println("=================== MENU KAFE JTI ===================");
System.out.println("----------------------------------------------------");
System.out.println("1. Ricebowl");
System.out.println("2. Ice Tea");
System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
System.out.println("----------------------------------------------------");

System.out.print("Masukkan angka dari menu yang dipilih = ");
pilihan_menu = Input12.nextInt();
Input12.nextLine();

System.out.print("Apakah punya member (y/n)? = ");
member = Input12.nextLine();
System.out.println("----------------------------------------------------");


if (member.equals("y")) { 
    diskon = 0.1;
    System.out.println("Besar diskon = 10%");

    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga Ricebowl = " + harga);
    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga Ice Tea = " + harga);
    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea) = " + harga);
    } else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; 
    }
} 
else if (member.equals("n")) { 
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga Ricebowl = " + harga);
    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga Ice Tea = " + harga);
    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea) = " + harga);
    } else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; 
    }
} else {
    System.out.println("Input member tidak valid");
    return;
}

totalBayar = harga - (harga * diskon);
System.out.println("Total bayar setelah diskon = " + totalBayar);

System.out.println("Metode Pembayaran (Tunai/QRIS): ");
metodeBayar = Input12.nextLine().toLowerCase();

if (!metodeBayar.equals("tunai") && !metodeBayar.equals("qris"))
    System.out.println("Metode pembayaran tidak valid");
    
if (metodeBayar.equals("QRIS")) {
    totalBayar -= 1000;
    System.out.println("Pembayaran melalui QRIS, mendapatkan potongan 1000");
}

System.out.println("Total Bayar = " + totalBayar);
System.out.println("----------------------------------------------------");

    }
}