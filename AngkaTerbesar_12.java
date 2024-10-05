import java.util.Scanner;

public class AngkaTerbesar_12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);

int bil1, bil2, bil3, max;

System.out.print("masukkan bilangan 1: ");
bil1 =Input12.nextInt();
System.out.print("masukkan bilangan 2: ");
bil2 =Input12.nextInt();
System.out.print("masukkan bilangan 3: ");
bil3 =Input12.nextInt();

if (bil1 > bil2){
    if (bil1 > bil3){
        max = bil1;
    } else {
        max = bil3;
    }
} else {
    if (bil2 > bil3){
        max = bil2;
    } else {
        max = bil3;
    }
}
System.out.println("Bilangan terbesar adalah: " + max);
    }
}