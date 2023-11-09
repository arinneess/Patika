import java.util.Scanner;

public class PatikaDevNotHesaplama {
    public static void main(String[] args){
        /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
         kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         */
        int Mat, Fizik, Kimya, Turkce, Tarih, Muzik, Derssayisi;
        Scanner Matn = new Scanner(System.in);
        Scanner Fizikn= new Scanner(System.in);
        Scanner Kimyan=new Scanner(System.in);
        Scanner Turkcen=new Scanner(System.in);
        Scanner Tarihn= new Scanner(System.in);
        Scanner Muzikn=new Scanner(System.in);
        Scanner Derssayisin=new Scanner(System.in);
        System.out.print("Ders sayısını giriniz:");
        Derssayisi=Derssayisin.nextInt();

        System.out.print("Matematik notunu giriniz:");
        Mat=Matn.nextInt();
        System.out.print("Fizik notunu giriniz:");
        Fizik=Fizikn.nextInt();
        System.out.print("Kimya notunu giriniz:");
        Kimya=Kimyan.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        Turkce=Turkcen.nextInt();
        System.out.print("Tarih notunu giriniz:");
        Tarih=Tarihn.nextInt();
        System.out.print("Müzik notunu giriniz:");
        Muzik=Muzikn.nextInt();
        double ort;
        int gecti=60;
        ort= (Mat+Fizik+Kimya+Turkce+Tarih+Muzik)/Derssayisi;
        System.out.print("Not ortalaması:");
        System.out.println(ort);
        boolean gecme = ort>=gecti;
        String kaldıgecti= gecme ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(kaldıgecti);



    }



}

