package metotogrenmesi;
import java.util.Scanner;
public class metotbaslangic {
    static int carpim(int s1, int s2){
        int sonuc= s1*s2;
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("s1 sayısını giriniz:");
        int s3= input.nextInt();
        System.out.println("s1 sayısını giriniz:");
        int s4= input.nextInt();
        int sonuc=carpim(s3,s4);
        System.out.println("Sonuc="+carpim(s3,s4));
        System.out.println("Sonuc 2="+sonuc);
        int [] dizi1=new int [6];
        int [] diziler2={1,5,43,3,3,3,2,2,45,8,6};
        for (int i=0; i<diziler2.length ; i++){
            System.out.println(diziler2[i]);
        }



    }
}
