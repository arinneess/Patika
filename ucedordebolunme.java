//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
// sayıların ortalamasını hesaplayan programı yazınız.
package patikaodevleri;
import java.util.Scanner;
public class ucedordebolunme {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi,ort=0;
        int sayac=0;
        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();
        int i;
        for(i=1;i<sayi;i++){
            if((i%3==0)&&(i%4==0)){
                ort=ort+i;
                sayac++;

            }


        }
        System.out.println("Sisteme girilen"+sayi+"sayısına kadar olan sayılardan 3 e ve 4 e bölünen sayıların ortalaması:"+(ort/sayac));



    }



}
