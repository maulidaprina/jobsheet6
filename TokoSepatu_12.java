import java.util.Scanner;

public class TokoSepatu_12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);

String merk, kategori;
int ukuran, totalHarga;

System.out.println("1. Converse");
System.out.println("2. Sketcher");
System.out.println("3. Nike");
System.out.print("Masukkan Merk Sepatu: ");
merk = Input12.nextLine().toLowerCase();

switch (merk) {
    case "converse":
        System.out.print("Masukkan kategori (Slip On/High Top) : ");
        kategori = Input12.nextLine().toLowerCase();
        switch (kategori) {
            case "slip on" :
                System.out.print("Masukkan ukuran (36-40): ");
                ukuran = Input12.nextInt();
                if (ukuran < 36 || ukuran > 40) {
                    System.out.println("Maaf ukuran tidak tersedia");
                } else {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp 800.000", merk, kategori, ukuran)); 
                }
                break;
            case "high top":
                    System.out.print("Masukkan ukuran (40-44): ");
                    ukuran = Input12.nextInt();
                    if (ukuran < 40 || ukuran > 44) {
                        System.out.println("Maaf ukuran tidak tersedia");
                    } else {
                        System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp 1.200.000", merk, kategori, ukuran)); 
                    }
                    break;
                default:
                    System.out.println("kategori tidak tersedia");
                    break;
        }
        break;
    
    case "sketcher":
        System.out.print("Masukkan kategori (Woman/Man) : ");
        kategori = Input12.nextLine().toLowerCase();
        switch (kategori) {
            case "woman" :
                System.out.print("Masukkan ukuran (36-41): ");
                ukuran = Input12.nextInt();
                if (ukuran < 36 || ukuran > 41) {
                    System.out.println("Maaf ukuran tidak tersedia");
                } else {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp 1.000.000", merk, kategori, ukuran)); 
                }
                break;
            case "man":
                System.out.print("Masukkan ukuran (41-44): ");
                ukuran = Input12.nextInt();
                if (ukuran < 41 || ukuran > 44) {
                    System.out.println("Maaf ukuran tidak tersedia");
                } else {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp 1.800.000", merk, kategori, ukuran)); 
                }
                break;
            default:
                System.out.println("kategori tidak tersedia");
                break;
        }
    break;

 case "nike":   
    System.out.print("Masukkan kategori (Kids/Adult) : ");
    kategori = Input12.nextLine().toLowerCase();
        switch (kategori) {
            case "kids" :
                System.out.print("Masukkan ukuran (36-40): ");
                ukuran = Input12.nextInt();
                if (ukuran < 36 || ukuran > 40) {
                System.out.println("Maaf ukuran tidak tersedia");
                } else {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp 750.000", merk, kategori, ukuran)); 
                }
                break;
        case "adult":
            System.out.print("Masukkan ukuran (40-44): ");
            ukuran = Input12.nextInt();
            if (ukuran < 40 || ukuran > 44) {
                System.out.println("Maaf ukuran tidak tersedia");
            } else {
                System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp 1.500.000", merk, kategori, ukuran)); 
            }
            break;
        default:
            System.out.println("kategori tidak tersedia");
            break;
    }
    break;
default:
    System.out.println("Merk tidak tersedia");
    break;

        }
    }
}