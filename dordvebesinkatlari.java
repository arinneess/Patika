//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
package patikaodevleri;
import java.util.Scanner;
public class dordvebesinkatlari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,i;
        System.out.println("Bir sayı giriniz:");
        sayi=input.nextInt();
        int dordk=4,besk=5,dongu=1;
        for(i=0;i<sayi;i++){
            if ((i % dordk == 0) || (i % besk == 0)) {

                System.out.println(i);
                if(dongu >= 0) {
                    dongu=-1;
                }
                else if (i % 4 == 0) {            //lütfen elseleri koymayı unutmayalım öptüm bay mert
                    dordk = dordk * 4;
                }
                else if (i % 5 == 0) {
                    besk = besk * 5;
                }


            }


        }



    }

    }