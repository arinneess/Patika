//Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program(0 hariç)
package patikaodevleri;
import java.util.Scanner;
public class ciftsayilar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi=input.nextInt();
        int i;
        for(i=0;i<sayi;i++) {
            if(i==0){
                continue;
            }
            else if(i%2==0){
                System.out.println(i);
            }







        }
    }
}
