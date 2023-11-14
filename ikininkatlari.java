//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
package patikaodevleri;
import java.util.Scanner;
public class ikininkatlari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı giriniz:");
        sayi=input.nextInt();
        int ikikuvvet=2,k;
        for(k=0;k<sayi;k++){
            if(k%ikikuvvet==0){
                System.out.println(k);
                ikikuvvet=ikikuvvet*2;
            }



        }





    }
}
