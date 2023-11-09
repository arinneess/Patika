import java.util.Scanner;
public class Taksimetre {
    public static void main(String[]args){
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        int acilis=10;
        double kmbasi=2.20;
        double mintutar=20;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen tutan kmyi yazınız:");
        double ucret;
        double tutankm;
        tutankm=input.nextDouble();
        ucret=acilis+(kmbasi*tutankm);
        String yirmiustmu= ucret<mintutar ? "Ödemeniz gereken miktar minimum ödeme tutarımızın altında olduğu için ödeme tutarınız 20 tldir.0 ı tuşlayınız."  : "Ödemeniz gereken tutarı öğrenmek için 1 e basınız";
        System.out.println(yirmiustmu);
        System.out.println("Ödeme tutarınızı görmek için 1 i tuşlayınız:");
        int birmisifirmi;
        birmisifirmi= input.nextInt();
        System.out.println("Tutarınız:"+ucret);









    }
}
