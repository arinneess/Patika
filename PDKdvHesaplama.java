import java.util.Scanner;
public class PDKdvHesaplama {
    public static void main(String[] args){
    /* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)*/
        double urun;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatını giriniz:");
        urun=input.nextDouble();
        double onsekizkdv;
        double sekizkdv;
        onsekizkdv=urun*18/100;
        sekizkdv=urun*8/100;
        boolean kdvbelirleme= urun>=1000;
        String bintluzeri= kdvbelirleme ? "Ürün 1000tl ve üzeridir bu yüzden kdv oranı %8dir." : "Ürün 1000 tl altındadır bu yüzden kdv oranı %18dir.";
        System.out.println(bintluzeri);
        double kdvfiyati= kdvbelirleme ? sekizkdv : onsekizkdv;
        System.out.print("ürünün kdv ücreti:");
        System.out.println(kdvfiyati);
        double sonfiyat= kdvbelirleme? sekizkdv+urun : onsekizkdv+urun;
        System.out.println("Ürünün kdvli fiyatı:");
        System.out.println(sonfiyat);




    }

}
